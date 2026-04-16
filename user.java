package com.library;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String id;
    private List<Book> issuedBooks;
    private int daysBorrowed;
    
    // Constants for fine calculation
    private static final int ALLOWED_DAYS = 7;
    private static final double FINE_PER_DAY = 2.0;

    public User(String name, String id, int daysBorrowed) {
        this.name = name;
        this.id = id;
        this.daysBorrowed = daysBorrowed;
        this.issuedBooks = new ArrayList<>();
    }

    public void addIssueBook(Book book) {
        issuedBooks.add(book);
    }

    public double calculateFine() {
        if (daysBorrowed > ALLOWED_DAYS) {
            return (daysBorrowed - ALLOWED_DAYS) * FINE_PER_DAY;
        }
        return 0.0;
    }

    public void displayStatus() {
        System.out.println("\n--- User Borrowing Status ---");
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
        System.out.println("Days Borrowed: " + daysBorrowed);
        System.out.println("Books Issued:");
        for (Book b : issuedBooks) {
            System.out.println("- " + b.getTitle());
        }
        double fine = calculateFine();
        System.out.println("Total Fine: $" + fine + (fine > 0 ? " (Late)" : " (On time)"));
    }
}
