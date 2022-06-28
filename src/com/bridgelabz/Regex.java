package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex<T> {
    static Scanner scanner = new Scanner(System.in);
    private T firstName;

    public void firstName() {
        System.out.println("Enter the First Name");
        T name = (T) scanner.next();
        boolean result = (Pattern.matches("[a-zA-z\\d]{3,10}", (CharSequence) name));
        if (result) {
            firstName = name;
        } else {
            System.out.println("Invalid Name please try again");
            firstName();
        }
    }

    public String toString() {
        return "Regex{" +
                "firstName=" + firstName +
                '}';
    }
}
