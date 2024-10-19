package org.example;
/*  Static var can be access 4 ways :
     by var itself, through object ref var, through class name, through null ref var
     Params - are called stack variable/ auto vars (coz memory deleted after execution)
     Local Var- Stack var/auto vars (coz memory deleted after execution )
*/
public class Main {

    static int varr1 = 5;
    static int var2 = 10;
    int jar3 = 20;
    static double a;
    byte b;
    byte[] b1;
    static {
        int varr1= 100;
        System.out.println("Val of varr1 here is "+varr1);
    }
    public static void main(String[] args) //args is a variable that is parameter type since it is with in ()
     {

        Main m1 = new Main(); //creating new memory m1 through which static var accessible

        Main m2= null; // only null value can be assigned to reference variable m2 as default val for ref types

        System.out.println("Static var value "+m2.varr1+varr1);

        //System.out.println("Calling class var with out object ref. "+m2.jar3);
        // you get null pointer exception

        System.out.println("Hello world!, getting default byte value with out assigning= "+m1.b+
                " and byte array is= "+new Main().b1);
        //Ref data type = String, array, class is null

        //System.out.println(m1.x); //error can not find symbol...hint: it's a local var
        System.out.println("Hello world!, getting default double value with out assigning= "+m2.a);

    }
   // memory to below int x assigned only when method is called as m1()
    static void m1(){
        int x= 10; // non-static var but local variable
        int y; // only declared, value not asssigned. local var don't have default values
        System.out.println("1st Local var"+x);
        // System.out.println("2nd Local var"+y);//hoping for default value
        //******************Local BLOCK*&*&*&*&&*&*&&*&*&*&*&*********
        {
            String p = "Local Block";
          //  String X= p+p;
        }
        //System.out.println("checking if auto variable inside local block destroyed or not"+X);
        //*************Var*************

        var v = "sollu"; //Var can be used only as local variable

        System.out.println("Var can be used only as local variable and a reserved word my an");
    }



}

