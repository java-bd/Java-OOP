package com.netcse.java;

public class Main {

    public static void main(String[] args) {

        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement s : stackTraceElement) {
            System.out.println(s.toString());
        }

        System.out.println("-----------------------------------------");
        calc();

    }

    public static void calc() {
        System.out.println("This is calc");
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement s : stackTraceElement) {
            System.out.println(s.toString());
        }
    }
    
}
