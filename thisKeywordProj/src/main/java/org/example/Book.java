package org.example;

import java.util.Date;

public class Book {

    //Declaring Fields

    byte iStatus;
    int iPages;
    String sTitle, sAuthor, sBorrowedBy, sReservedBy;
    String DueDate;
    public static final byte BORROWED = 0 , AVAILABLE =1, RESERVED =2; //if final used then should initialize value


    public Book (String Title, String Author, int Pages){

        System.out.println("Step 1--> initialized, values are :- "+  " this.stitle = "
                +this.sTitle+ " this.sAuthor = "+this.sAuthor+" this.sPage = "+this.iPages+
                " sBorrowedBy : "+this.sBorrowedBy
               );

        this. sTitle = Title;
        this.sAuthor = Author;
        this.iPages = Pages;
       // this.iStatus = AVAILABLE;

        System.out.println("Assigned values --> Title :"+this.sTitle+
                "AUthor  : "+this.sAuthor+
                "Pages :  "+this.iPages +" see the diff b/w local and this var");

    }

    public  byte Borrow( String Borrower, String Title, String TillDue){

        if ((this.iStatus == AVAILABLE) || (this.iStatus == 0)){

            this.sTitle = Title;
            this.DueDate = TillDue;
            this.sBorrowedBy = Borrower;
            this.iStatus = BORROWED;
            System.out.println("Book is now "+iStatus+" meaning borrowed till: "+DueDate);
        } else if (this.iStatus == BORROWED && this.sBorrowedBy== Borrower)  {

            this.DueDate = TillDue;
            System.out.println("This book is reserved by you");

        }
        return this.iStatus;
    }
}
