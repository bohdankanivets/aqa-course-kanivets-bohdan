package com.course.oop;

public class Manager extends User {

    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String fullName, String email, RoleType role, String position) {
        super(fullName, email, role);
        this.position = position;
    }

    public Manager(String firstName, String lastName, String email, RoleType role, String position) {
        super(firstName, lastName, email, role);
        this.position = position;
    }

    public Manager(String email, RoleType role, String position) {
        super(email, role);
        this.position = position;
    }

    public Manager(String position) {
        super();
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
               "firstName='" + getFirstName() + '\'' +
               ", lastName='" + getLastName() + '\'' +
               ", fullName='" + getFullName() + '\'' +
               ", email='" + getEmail() + '\'' +
               ", phoneNumber='" + getPhoneNumber() + '\'' +
               ", billingAddress='" + getBillingAddress() + '\'' +
               ", deliveryAddress='" + getDeliveryAddress() + '\'' +
               ", role='" + getRole() + '\'' +
               ", position='" + position + '\'' +
               ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
               ", workPhoneNumber='" + workPhoneNumber + '\'' +
               '}';
    }
}
