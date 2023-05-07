package com.course.oop;

public class Main {

    public static void main(String[] args) {

        Address billingAddress = new Address("Ukraine", "Kyiv", "Khreshchatyk", "74A", "125644");
        Address deliveryAddress = new Address("Ukraine", "Kyiv", "Khreshchatyk", "4", "4231235");

        Card card = new Card("123123123", "12/12/2024", "123", "Visa");
        Manager manager = new Manager("Jon2 Armstrong", "test2@gmail.com", new RoleType("Main Customer"), "Main manager");
        manager.printUserInfo();

        User user = new User("Jon", "Armstrong", "test@gmail.com", new RoleType("Admin"), billingAddress, deliveryAddress);
        User user1 = new User("Jon1", "Armstrong1", "test1@gmail.com", new RoleType("Viewer"), new Manager("Director"));
        User user2 = new User("Jon2 Armstrong", "test2@gmail.com", new RoleType("Main Customer"), billingAddress, deliveryAddress);
        user.setPhoneNumber("+12132132");
        user.setCards(card);
        user.printUserInfo();
        user1.printUserInfo();
        user2.printUserInfo();
    }
}
