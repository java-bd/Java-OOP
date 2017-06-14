package com.netcse.java;

public class Main {

    private static final String OS_NAME = System.getProperty("os.name").toString();

    public static void main(String[] args) {
        System.out.println("Hello world java programming in this world is nothing but java");
        System.out.println(OS_NAME);
        System.out.println(System.getProperty("os.arch").toString());
    }
}
