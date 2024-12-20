public class Main extends subMain  {

    {
        System.out.println("4.Hey Just a simple NSB");
    }
    Main(){
        System.out.println("5. Before this Super keyword gets executed since, memory allocated from top down of inherited classes " +
                "with object being the utmost super class and then goes regular memory pref across all classes 1. static variable first 2. static block, 3. nsv,nsb");
    }
    static void m1() {

        System.out.println("Sample m1");
    }

    void m2(){
        System.out.println("**Sample m2**");
    }

    void m4(String s){
        System.out.println("====Sample m4(String-param)====");
    }

    public static void main(String[] args) {

    Main m = new Main();
    m.m1(); //essentially this is like classname.method since it is static jvm will not use memory for it
    m.m2();
    m.m3();
    m.m4();
    m.m4("HK");

    subMain e = new Main();//essentially you are asking jvm to create memory for all classes top down  (assigning memory from top floor to bottom)
        // however during compile time compiler looks if def exists (2b 2b room exists in top floor) in super class then (during compile time) execute thru  class that was given object memory (bottom floor)
        // if doesn't exists in sub class (bottom floor) execute from top floor (super class). If top floor doesn't have it then Error.
    e.m1();//m1 checked in during compile time.since it is static  jvm won't read from new Main() [memory],ssentially this is like static classname.method
    e.m2();
    e.m3();
    e.m4();
    //e.m4("s"); // no class in submain super class hence ce
    System.out.println("STATIC METHOD IS HIDING, NSM IS OVER RIDING!");
    }
}