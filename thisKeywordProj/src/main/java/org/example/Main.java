package org.example;

import java.util.Arrays;
import java.util.Objects;
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
    static String[] a = {"a2","a1"};
    static void m1(String[] a){
        Main.a=a;
        System.out.println("INSIDE static METHOD : "+ Arrays.toString(a));
        if (Main.a== a || Objects.equals(Main.a, a)){
            System.out.println("2.3. here equality is for object not for( array len or array value in forloop)"+Arrays.toString(Main.a));
        }

    }
    static int p = illegalfwdref.a1;
    public static void main(String[] args) {
        System.out.println("Step 1-> Initialize static vars" + Arrays.toString(a));
        System.out.println("is illegal fwd class laod with a1 ->" + p);
        try {
            //int ce = ce; local variable can not be assigned becuase it doesn't have initialization value
            System.out.println("2.1. See if a what is b1 value now, although b1 is " +
                    "declared at the down -->"+ b1);
            m1(new String[]{"a2","a1"});

            System.out.println("Please enter Guests Names :");
            // Scanner sc = new Scanner(System.in);
            //sc.nextLine();
            // Book b = new Book(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            Book b = new Book("Saran is Great", "Saran", 1);
            byte status = b.Borrow("Saran", "Saran is Great", "2/10/2024");
            //while i < b.length :
            byte status2 = b.Borrow("Saran", "Saran is Great", "2/10/2024");
            if (status2 == 0) {

                System.out.println("Book is Borrowed");
            }
            //System.out.println("String array is: " + sc.toString());
            else if (status == 1) {
                System.out.println("Book is Available");
            }
        } catch  (Exception e) {
            System.out.println("Error is:"+e.getMessage());
        }

        }
    static int b1 =1000;

    }
