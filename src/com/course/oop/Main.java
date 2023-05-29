package com.course.oop;


import java.util.List;

import static com.course.oop.RoleType.Type.ADMIN;
import static com.course.oop.RoleType.Type.MAIN_CUSTOMER;
import static com.course.oop.RoleType.Type.VIEWER;

public class Main {

    public static void main(String[] args) {

        Address billingAddress = new Address("Ukraine", "Kyiv", "Khreshchatyk", "74A", "125644");
        Address deliveryAddress = new Address("Ukraine", "Kyiv", "Khreshchatyk", "4", "4231235");

        Card card = new Card("123123123", "12/12/2024", "123", "Visa");
        Card card1 = new Card("121444", "12/12/2025", "333", "MasterCard");
        Manager manager = new Manager("Jon2 Armstrong", "test2@gmail.com", new RoleType(MAIN_CUSTOMER), "Main manager");
        manager.printInfo();

        User user = new User("Jon", "Armstrong", "test@gmail.com", new RoleType(ADMIN), billingAddress, deliveryAddress);
        User user1 = new User("Jon1", "Armstrong1", "test1@gmail.com", new RoleType(VIEWER), new Manager("Director"));
        User user2 = new User("Jon2 Armstrong", "test2@gmail.com", new RoleType(MAIN_CUSTOMER), billingAddress, deliveryAddress);
        Broker broker = new Broker("BrokerName", "broker@gmail.com", "1231231234");
        broker.addClients(List.of(user, user1, user2));
        broker.printInfo();
        user.setPhoneNumber("+12132132");
        user.setCards(List.of(card, card1));
        user.getCardNumbers();
        user.printInfo();
    }
}
