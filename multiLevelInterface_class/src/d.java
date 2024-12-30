public class d extends c{
    //class b,c,d are Multi Level Inhertience
    void m1(){
        System.out.println("Checking THIS in class d");
        super.main3();
    }

    public static void main(String[] args){

       //  = new d();
        c c1 = new c();
        System.out.println("===> Next Object<===");
        c C1 = new d();
        System.out.println("Now Super class ref var pointed to sub class object-->");
        c1.m2();
        c1.main3();//super class main3 via int=heritence and memory allocated from current class
        //all the way from Top to bottom
        c1.main2();
        System.out.println("Execute Ring Interface ==>"+c1.ring());
        System.out.println("Execute subRing Interface ==>"+c1.subRing());

    }
}
