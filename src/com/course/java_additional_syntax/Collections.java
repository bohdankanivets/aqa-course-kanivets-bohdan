package com.course.java_additional_syntax;

import com.course.oop.Address;
import com.course.oop.Manager;
import com.course.oop.RoleType;
import com.course.oop.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static com.course.oop.RoleType.Type.ADMIN;
import static com.course.oop.RoleType.Type.MAIN_CUSTOMER;
import static com.course.oop.RoleType.Type.VIEWER;
import static java.lang.Integer.parseInt;

public class Collections {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        Map<String, String> unsortedMap =
                Map.of("a", "test1", "ab", "test2", "abc", "test3", "fgh", "test4", "323rd", "test5");
        System.out.println(task4(unsortedMap));

    }

    public static void task1() {
        System.out.println("Step 4. Collections - Task 1");
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(3);
        sortedSet.add(2);
        sortedSet.add(7);
        System.out.println(sortedSet);
    }

    public static void task2() {
        System.out.println("Step 4. Collections - Task 2");
        Address billingAddress = new Address("Ukraine", "Kyiv", "Khreshchatyk", "74A", "125644");
        Address deliveryAddress = new Address("Ukraine", "Kyiv", "Khreshchatyk", "4", "4231235");
        ArrayList<User> usersArray = new ArrayList<>(Arrays.asList(
                new User("Jon", "Armstrong", "test@gmail.com", new RoleType(ADMIN), billingAddress, deliveryAddress),
                new User("Jon1", "Armstrong1", "test1@gmail.com", new RoleType(VIEWER), new Manager("Director")),
                new User("Jon2 Armstrong", "test2@gmail.com", new RoleType(MAIN_CUSTOMER), billingAddress, deliveryAddress),
                new User("Jon123", "Armstrong13", "test@gmail.com", new RoleType(VIEWER))));
        Map<Integer, User> usersMap = new HashMap<>();
        for (User currentUser : usersArray) {
            int key = parseInt(currentUser.getId());
            usersMap.put(key, currentUser);
            if (key % 2 == 0) {
                System.out.println(currentUser);
            }
        }
    }

    public static void task3() {
        System.out.println("Step 4. Collections - Task 3");
        Set<String> setValues = new HashSet<>(Set.of("Olya", "Natasha", "Polina", "Vlad"));
        List<String> listValues = List.of("Bohdan", "Oleksandr", "Vlad", "Natasha");
        setValues.addAll(listValues);
        System.out.println("All values of result collection: " + setValues);
    }

    public static Map<String, String> task4(Map<String, String> unsortedMap) {
        System.out.println("Step 4. Collections - Task 4");
        return unsortedMap.entrySet().stream().filter(x -> x.getKey().length() == 3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}
