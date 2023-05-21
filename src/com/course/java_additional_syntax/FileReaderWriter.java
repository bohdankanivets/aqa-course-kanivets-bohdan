package com.course.java_additional_syntax;

import com.course.oop.RoleType;
import com.course.oop.User;
import com.course.oop.exceptions.IncorrectRoleException;
import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.course.oop.RoleType.Type.ADMIN;
import static com.course.oop.RoleType.Type.CUSTOMER;
import static com.course.oop.RoleType.Type.MAIN_CUSTOMER;
import static com.course.oop.RoleType.Type.VIEWER;

public class FileReaderWriter {

    private static final String FILE_PATH = "users.csv";

    public static void main(String[] args) {

        Scanner scanner;
        String fullName;
        String email;
        RoleType roleType;

        while (true) {
            System.out.println("Please, use following command add user | print users | exit");
            scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "add user" -> {
                    do {
                        System.out.println("Please, type user full name (e.g. Jon Jonson)");
                        fullName = scanner.nextLine();
                        System.out.println("Please, type user email (e.g. user@gmail.com)");
                        email = scanner.nextLine();
                        System.out.println("Please, type user role type (e.g. Admin, Main Customer, Customer, Viewer)");
                        roleType = getRoleType(scanner.nextLine());
                    }
                    while (!email.contains("@gmail.") && !fullName.isBlank());
                    User user = new User(fullName, email, roleType);
                    writeToCsvFile(user);
                }
                case "print users" -> {
                    readFromCsvFile();
                }
                case "exit" -> {
                    return;
                }
            }
        }
    }

    public static RoleType getRoleType(String role) {
        switch (role) {
            case "Admin" -> {
                return new RoleType(ADMIN);
            }
            case "Main Customer" -> {
                return new RoleType(MAIN_CUSTOMER);
            }
            case "Customer" -> {
                return new RoleType(CUSTOMER);
            }
            case "Viewer" -> {
                return new RoleType(VIEWER);
            }
            default -> throw new IncorrectRoleException("Role " + role + " is incorrect");
        }
    }

    public static void writeToCsvFile(User user) {
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(FILE_PATH, true));
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            if (br.readLine() == null) {
                String[] header = {"id", "fullName", "email", "role"};
                writer.writeNext(header);
            }
            String[] userData = {user.getId(), user.getFullName(), user.getEmail(), user.getRole().toString()};
            writer.writeNext(userData);
            System.out.println("User was successfully added!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromCsvFile() {
       try {
           BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
           String line = reader.readLine();
           while (line != null) {
               System.out.println(line);
               line = reader.readLine();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
