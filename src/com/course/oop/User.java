package com.course.oop;

import com.course.oop.exceptions.IncorrectFullNameException;
import com.course.oop.exceptions.IncorrectPhoneNumberException;

import java.util.ArrayList;

public class User {

    private static int uniqueId = 0;
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Card> cards;
    private RoleType role;
    private Manager manager;


    public User(String fullName, String email, RoleType role) {
        this(email, role);
        this.fullName = verifyAndSetFullName(fullName);
    }

    public User(String firstName, String lastName, String email, RoleType role) {
        this(email, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + " " + this.lastName;
    }

    public User(String firstName, String lastName, String email, RoleType role, Manager manager) {
        this(email, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + " " + this.lastName;
        this.manager = manager;
    }

    public User(String fullName, String email, RoleType role, Address billingAddress, Address deliveryAddress) {
        this(email, role);
        this.fullName = verifyAndSetFullName(fullName);
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;

    }

    public User(String firstName, String lastName, String email, RoleType role, Address billingAddress, Address deliveryAddress) {
        this(email, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + " " + this.lastName;
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;
    }

    public User(String email, RoleType role) {
        this.id = generateUniqueUserId();
        this.email = email;
        this.role = role;
    }

    public User() {
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCards(Card card) {
        this.cards = new ArrayList<>();
        this.cards.add(card);
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public RoleType getRole() {
        return role;
    }

    public Manager getManager() {
        return manager;
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            if (phoneNumber.charAt(0) == '+') {
                this.phoneNumber = phoneNumber;        }
            else {
                throw new IncorrectPhoneNumberException("The phoneNumber value it must starts from + symbol");        }
        } catch (IncorrectPhoneNumberException e) {
            e.printStackTrace();
        }
    }

    public void printUserInfo() {
       System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", fullName='" + fullName + '\'' +
               ", email='" + email + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", billingAddress='" + billingAddress + '\'' +
               ", deliveryAddress='" + deliveryAddress + '\'' +
               ", role='" + role + '\'' +
               ", manager='" + manager + '\'' +
               '}';
    }

    public static String generateUniqueUserId() {
        ++uniqueId;
        return Integer.toString(uniqueId);
    }

    public String verifyAndSetFullName(String fullName) {
        int quantitySpace = fullName.split(" ").length - 1;
        if (quantitySpace == 1) {
            return fullName;
        } else {
            throw new IncorrectFullNameException("The fullName " + fullName + " is incorrect");
        }
    }
}
