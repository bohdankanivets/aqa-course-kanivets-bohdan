package com.course.oop;


import com.course.oop.exceptions.IncorrectCardTypeException;

import java.util.Objects;

import static com.course.oop.Card.CardType.MASTER_CARD;
import static com.course.oop.Card.CardType.VISA;

public class Card {

    private static int uniqueId = 0;
    private String id;
    private String number;
    private String expireDate;
    private String cvv;
    private String cardType;

    public Card(String number, String expireDate, String cvv, String cardType) {
        this.id = generateUniqueCardId();
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.cardType = verifyAndSetCardType(cardType);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        if (Objects.equals(cardType.toLowerCase(), VISA.getValue().toLowerCase())) {
            this.cardType = VISA.getValue();
        } else if (Objects.equals(cardType.toLowerCase(), MASTER_CARD.getValue().toLowerCase())) {
            this.cardType = MASTER_CARD.getValue();
        } else {
            System.out.println("CardType " + cardType + " is incorrect");
        }
    }

    public static String generateUniqueCardId() {
        ++uniqueId;
        return Integer.toString(uniqueId);
    }

    public static String verifyAndSetCardType(String cardType) {
        if (Objects.equals(cardType.toLowerCase(), VISA.getValue().toLowerCase())
            || Objects.equals(cardType.toLowerCase(), MASTER_CARD.getValue().toLowerCase())) {
            return cardType;
        } else {
            throw new IncorrectCardTypeException("CardType " + cardType + " is incorrect");
        }
    }

    @Override
    public String toString() {
        return "Card{" +
               "id='" + id + '\'' +
               ", number='" + number + '\'' +
               ", expireDate='" + expireDate + '\'' +
               ", cvv='" + cvv + '\'' +
               ", cardType='" + cardType + '\'' +
               '}';
    }

    public enum CardType {
        VISA("Visa"),
        MASTER_CARD("MasterCard");

        private final String type;

        CardType(String type) {
            this.type = type;
        }

        public String getValue() {
            return this.type;
        }
    }
}
