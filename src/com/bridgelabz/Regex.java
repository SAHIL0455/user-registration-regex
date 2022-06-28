package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex<T> {
    static Scanner scanner = new Scanner(System.in);
    private T FirstName;
    private T LastName;

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
    public void lastName(){
        System.out.println("Enter the Last Name");
        T lastname = (T) scanner.next();
        boolean result = (Pattern.matches("[a-zA-Z\\d]{3,10}", (CharSequence) lastname));
        if(result){
            LastName = lastname;
        }else {
            System.out.println("Invalid Last Name Please try Again");
            lastName();
        }
    }
    @Override
    public String toString() {
        return "Regex{" +
                "First Name = " + FirstName +
                ", Last Name = " + LastName +
                '}';
    }

}
