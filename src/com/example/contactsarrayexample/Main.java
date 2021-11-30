package com.example.contactsarrayexample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        int[] numbers = {1111, 2222, 3333, 4444, 5555, 6666,};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a Name: ");
        Scanner scanner = new Scanner(System.in);
        String userInputName = scanner.next();
        for (int i = 0; i < names.length; i++) {
            if (userInputName.equals(names[i])) {   //equals method for match string
                System.out.println(numbers[i]);
            }
        }
    }
}
