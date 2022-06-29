package com.bridgelabz;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        Regex regex = new Regex();
//        regex.firstName();
//        regex.lastName();
//        regex.emailID();
//        regex.phoneNumber();
        regex.password();
        System.out.println(regex.toString());
    }
}
