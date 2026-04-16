package com.library;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int allowedDays = 7;
        double finePerDay = 5.0;

        System.out.println("--- Library Management System ---");
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();
        System.out.print("Enter User ID: ");
        String id = sc.next();
        System.out.print("Enter Number of Books Issued: ");
        int numBooks = sc.nextInt();
        System.out.print("Enter Number of Days Borrowed: ");
        int days = sc.nextInt();

        int extraDays = Math.max(0, days - allowedDays);
        double totalFine = extraDays * finePerDay * numBooks;

        System.out.println("\n--- User Borrowing Status ---");
        System.out.println("User: " + name + " (ID: " + id + ")");
        System.out.println("Books Issued: " + numBooks);
        System.out.println("Total Fine: ₹" + totalFine);
        
        sc.close();
    }
}
