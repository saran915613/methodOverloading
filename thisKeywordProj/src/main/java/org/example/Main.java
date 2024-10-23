package org.example;

import java.util.Scanner;

/* Create collection of books
       List books and status
       User Input:
       'B' = Borrow a book
       'R' = Reserve a book
       'I' = Return a book
       'X' = Exit Program
       Consider 3 guests are in library now
        */
public class Main {
    static String[] a = {};

    public static void main(String[] args) {

        System.out.println("Please enter Guests Names :");
       // Scanner sc = new Scanner(System.in);
        //sc.nextLine();
       // Book b = new Book(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        Book b = new Book("Saran is Great","Saran",1);
        byte status = b.Borrow("Saran","Saran is Great","2/10/2024");
            //while i < b.length :
        byte status2 = b.Borrow("Saran","Saran is Great","2/10/2024");
        if (status2 == 0) {

            System.out.println("Book is Borrowed");
        }
            //System.out.println("String array is: " + sc.toString());
        else if (status ==1){
            System.out.println("Book is Available");
        }
        }
    }
