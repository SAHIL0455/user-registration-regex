package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex<T> {
    static Scanner scanner = new Scanner(System.in);
    private T FirstName;
    private T LastName;
    private T EmailID;
    private T PhoneNumber;
    private T Password;

    public void firstName() {
        System.out.println("Enter the First Name");
        T name = (T) scanner.next();
        boolean result = (Pattern.matches("[a-zA-z\\d]{3,10}", (CharSequence) name));
        if (result) {
            FirstName = name;
        } else {
            System.out.println("Invalid Name please try again");
            firstName();
        }
    }

    public void lastName() {
        System.out.println("Enter the Last Name");
        T lastname = (T) scanner.next();
        boolean result = (Pattern.matches("[a-zA-Z\\d]{3,10}", (CharSequence) lastname));
        if (result) {
            LastName = lastname;
        } else {
            System.out.println("Invalid Last Name Please try Again");
            lastName();
        }
    }

    public void emailID() {
        System.out.println("Enter the Email ID");
        T emailID = (T) scanner.next();
        boolean result = (Pattern.matches("^[a-zA-Z\\d+_.-]+@[a-zA-Z]+.[a-zA-z]{2,}", (CharSequence) emailID));
        if (result) {
            EmailID = emailID;
        } else {
            System.out.println("Invalid Email ID Please try Again");
            emailID();
        }
    }

    public void phoneNumber() {
        System.out.println("Enter the Phone Number with Country Code ");
        T phoneNumber = (T) scanner.next();
        boolean result = (Pattern.matches("^[\\d]{2}[789]{1}[\\d]{9}", (CharSequence) phoneNumber));
        if (result) {
            PhoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid Phone Number Please try Again");
            phoneNumber();
        }
    }

    public void password() {
        System.out.println("Enter the Password");
        T password = (T) scanner.next();
        boolean result = Pattern.matches("([(A-Z)+])([a-zA-Z\\d@*#$&,.]{8,})", (CharSequence) password);
        if (result) {
            Password = password;
        } else {
            System.out.println("Invalid Password Please try again");
            password();
        }
    }

    @Override
    public String toString() {
        return "Registration Details{" +
                "First Name = " + FirstName +
                ", Last Name = " + LastName +
                ", Email ID = " + EmailID +
                ", Phone Number = " + PhoneNumber +
                ", Password = " + Password +
                '}';
    }

}
