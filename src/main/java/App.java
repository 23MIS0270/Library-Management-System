package com.library;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        
        System.out.print("How many books were issued? ");
        int bookCount = scanner.nextInt();
        scanner.nextLine();

        System.out.print("For how many days were they borrowed? ");
        int days = scanner.nextInt();
        scanner.nextLine();

        User user = new User(name, id, days);

        for (int i = 1; i <= bookCount; i++) {
            System.out.print("Enter Title for Book " + i + ": ");
            String title = scanner.nextLine();
            user.addIssueBook(new Book(title));
        }

        user.displayStatus();
        scanner.close();
    }
}
