package org.example;

import java.io.InputStream;
import java.util.Scanner;

public  class identifiers {

    static   int t= 104; //only static variables can be loaded in other clasees


    public static String test() {
        System.out.println("Hello world! from idetifiers class");
        return "Hello";

    }

    public static void literal(){

        //class literal meaning every class when
        //compiled has class file that is literal and can be reassigned
        java.lang.Class  sring1 = java.lang.String.class;
        Class _1sring12 = String.class; //Class type is not keyword class type but literal belong to Class
        //if my class name is String then String.class will reffer to local string rather than java.lang.string
        System.out.println("Trying to print class type -->"+_1sring12); //_ with numbr or letters should be followed
        _1sring12 = null;// null can be assigned to reference class data types can't be assigned to primitive types
        System.out.println("Class type now became --> NULL");
        //Null needs to be assigned with any reference datatype if not error occurs
        System.out.println((String)null);
        System.out.println("Here datatype var is array class "+(int [])null);
        System.out.println("null from here -- : "+_1sring12);
        String s1 = new String("hello");
        System.out.println("What is string value here"+s1);
    }

    public static void array() {

        double [] ai = {1,4,5.5};
       // InputStream ap = System.in;
        System.out.println("printing array"+java.util.Arrays.toString(ai));
        Scanner scn = new Scanner(System.in);
       // Scanner scn = new Scanner(ap);
        System.out.print("What you entered"+scn.nextLine());
        scn.close();

    }
}

