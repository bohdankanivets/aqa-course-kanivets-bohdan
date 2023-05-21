package com.course.oop;

import java.util.ArrayList;
import java.util.List;

public class Broker implements PrintInfo {

    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<User> clientsList;

    public Broker(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void addClients(List<User> clients) {
        this.clientsList = new ArrayList<>();
        this.clientsList.addAll(clients);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Broker{" +
               "name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", clientsList=" + clientsList +
               '}';
    }
}
