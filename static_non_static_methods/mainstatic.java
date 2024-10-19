import java.io.InputStream;
import java.util.Scanner;

import static java.lang.System.in;

public class mainstatic {

    public static void main(String[] args){

        april5_static_non ap = new april5_static_non();

        ap.thisvaluedemo();
        ap.accNum = 5000222;// current obj is execution is sent by default to this  param
       // System.out.println("this value here is"+ap.anu)
        ap.initializenonStaticFields();
        ap.deposit(6000);
        ap.withdraw(500);
        ap.currentBalance();
        ap.accNum = 50000333;
        ap.initializenonStaticFields ();
        //System.out.println(balance);
        //another calls april_10
        april10_return_methodcallvar a10= new april10_return_methodcallvar();
        short resulta10 = (short) a10.multiples(2);

        System.out.println("Final April 15th result= "+ (resulta10*10));
        Scanner sc= new Scanner(in);
        int in1 = sc.nextInt();
        boolean b= a10.checkevenodd(in1);
       // System.out.println("Is Input num is Even : "+b);
        System.out.println(b? in1 +" is even": in1 +" is odd");//ternary operator

        thisword the = new thisword();
        the.m1();

    }
}
