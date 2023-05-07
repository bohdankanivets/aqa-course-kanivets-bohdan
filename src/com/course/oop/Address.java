package com.course.oop;


public class Address {

    private static int uniqueId = 0;
    private String id;
    private String country;
    private String city;
    private String street;
    private String building;
    private String room;
    private String zip;

    public Address(String country, String city, String street, String building, String zip) {
        this.id = generateUniqueAddressId();
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zip = zip;
    }

    public Address(String country, String city, String street, String building, String room, String zip) {
        this(country, city, street, building, zip);
        this.room = room;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getId() {
        return id;
    }

    public static String generateUniqueAddressId() {
        ++uniqueId;
        return Integer.toString(uniqueId);
    }

    @Override
    public String toString() {
        return "Address{" +
               "id='" + id + '\'' +
               "country='" + country + '\'' +
               ", city='" + city + '\'' +
               ", street='" + street + '\'' +
               ", building='" + building + '\'' +
               ", room='" + room + '\'' +
               ", zip='" + zip + '\'' +
               '}';
    }
}
