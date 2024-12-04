package org.example;

public class illegalfwdref {

    //static String newSr = null;
    static String newSr = "Hey";
    static String newSr2 = new String("Hey");
    static int cq = illegalfwdref.cq;

    static int a1= 10;
    static {
        if (newSr != illegalfwdref.newSr2)
        {
            System.out.println("***** Here == compares object ref only exists or not, means not null ******"+"Object are: "+System.identityHashCode(newSr)+" , "
                    +System.identityHashCode(newSr2));
        }
        newSr2 = "Hey";
        if (newSr.equals( illegalfwdref.newSr2)) //Caused by: java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "org.example.illegalfwdref.newSr" is null
        {
            System.out.println("***** Here .equals method compares string object values   ******"+"Objects are: "+System.identityHashCode(newSr)+" , "
                    +System.identityHashCode(newSr2));
        }
        System.out.println("--> 1. See if Class Loader loading static classes by jvm only becuase" +
                "--assigning class variable in Main class " +
                +a1);
        System.out.println("2. See if a value printed first"+Main.b1);
        System.out.println("3. See if a value printed first"+ illegalfwdref.p1+" and cq = "+cq);

    }
    static int p1 = 50;


}
