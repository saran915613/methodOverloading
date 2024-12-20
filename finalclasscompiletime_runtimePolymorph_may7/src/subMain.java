public class subMain {

     {
        System.out.println("2. Hey Just a super class NSB");
     }
    static {
        System.out.println("1. Hey Just a super class SB");
    }
    subMain(){
        System.out.println("3. constructor exec");
    }
    static void m1(){
        System.out.println("Example m1, is executed when called from super class");
    }

    void m2(){
        System.out.println("Example m2");
    }
    void m3(){
        System.out.println("Example m3()");
    }
    void m4(){
        System.out.println("Example m4(no-param)");
    }
}
