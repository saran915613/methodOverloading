package org.example;

import java.util.Date;

public class Book {

    //Declaring Fields

    byte iStatus;
    int iPages;
    String sTitle, sAuthor, sBorrowedBy, sReservedBy;
    String DueDate;
    public static final byte ReadyToBORROW = 0 , AVAILABLE =1, RESERVED =2, BORROWED = 3; //if final used then should initialize value


    public Book (String Title, String Author, int Pages){

        System.out.println("Step 2--> initialized Non-staic values first and then constructor, \nsince" +
                " no non static block present. Initialized Values are :- \n"+ "this.stitle = "
                +this.sTitle+ " \nthis.sAuthor = "+this.sAuthor+" \nthis.sPage = "+this.iPages+
                " \nsBorrowedBy : "+this.sBorrowedBy
               );

        this. sTitle = Title;
        this.sAuthor = Author;
        this.iPages = Pages;
       // this.iStatus = AVAILABLE;

        System.out.println("Assigned values are :- \nTitle  : "+this.sTitle+
                "\nAuthor : "+this.sAuthor+
                "\nPages  : "+this.iPages +"\nthis shows the diff b/w local and this var");

    }

    public  byte Borrow( String Borrower, String Title, String TillDue) throws Exception {

        if ((this.iStatus == AVAILABLE) || (this.iStatus == 0)){

            this.sTitle = Title;
            this.DueDate = TillDue;
            this.sBorrowedBy = Borrower;
            this.iStatus = BORROWED;
            System.out.println("Book status is "+iStatus+" meaning Borrowed till: "+DueDate);
            throw new IllegalArgumentException("This book is reserved by Exception");
        } else if (this.iStatus == BORROWED && this.sBorrowedBy== Borrower)  {

            this.DueDate = TillDue;
            this.iStatus = RESERVED;
            throw new Exception("This book is reserved by you, don't try agian");
            //System.out.println("This book is reserved by you");

        }
        return this.iStatus;
    }
}
