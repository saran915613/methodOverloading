package org.example;

public class Main {

    static int u= 10;
    public static void main(String[] args) {



        Integer[] i = new Integer[] {};
        System.out.println("Hello world!");
        //m1(5.2);  //incompatible types double to float possible lossy conversion\
        m1(5.2f); // no error
        // m1(5.2d); //incompatible types: possible lossy conversion from double to float
        u= 50;
        identifiers.t = 500;
        identifiers.literal();
        callIdentifiers();
        Class<identifiers> identifiersClass = identifiers.class;
        java.lang.Class idcls = identifiers.class; //Class variable

        System.out.println("===***==="+identifiersClass+"====Class variable idcls ===="+idcls);
        //int System = 44;
        String System = "Tuss";
        // System.out.println("here system is user defined and " +
        // "system is user-defined as primitive. primitives do not have . ref as it is integer"+System);
        //When u want to use predfined class name as variable name to differentiate variable name and class name use it's pkg name
        java.lang.System.out.println("Now can be used by giving predefined pkg infront of class name-->"+System);
        identifiers.array();
    }
    static void m1(float x){

        System.out.println("yes this is float value : "+x);
    }
    public static void callIdentifiers(){

        int total = identifiers.t;
        System.out.println("variable t value now is -->"+identifiers.t);
        System.out.println("Printing external static class method return value --> "+identifiers.test());
    }


}

