package com.course.oop;

public class RoleType {

    private static final String ADMIN = "Admin";
    private static final String VIEWER = "Viewer";
    private static final String CUSTOMER = "Customer";
    private static final String MAIN_CUSTOMER = "Main Customer";
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    public RoleType(String role) {

        switch (role) {
            case ADMIN -> {
                this.viewAll = true;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = true;
            }
            case VIEWER -> {
                this.viewAll = true;
                this.editAll = false;
                this.addAll = false;
                this.deleteAll = false;
            }
            case CUSTOMER -> {
                this.viewAll = true;
                this.editAll = false;
                this.addAll = true;
                this.deleteAll = false;
            }
            case MAIN_CUSTOMER -> {
                this.viewAll = true;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = false;
            }
            default -> System.out.println("Role " + role + " is incorrect");
        }
    }

    @Override
    public String toString() {
        return "Role{" +
               "viewAll=" + viewAll +
               ", editAll=" + editAll +
               ", addAll=" + addAll +
               ", deleteAll=" + deleteAll +
               '}';
    }
}
