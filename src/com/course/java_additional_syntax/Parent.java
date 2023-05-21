package com.course.java_additional_syntax;

public class Parent {

    public Parent() {
        System.out.println("Default constructor Parent class");
    }

    static {
        System.out.println("Static initialization block Parent class");
    }

    {
        System.out.println("Initialization block Parent class");
    }

    public static class Child {

        public Child() {
            System.out.println("Default constructor Child class");
        }

        static {
            System.out.println("Static initialization block Child class");
        }

        {
            System.out.println("Initialization block Child class");
        }
    }
}
