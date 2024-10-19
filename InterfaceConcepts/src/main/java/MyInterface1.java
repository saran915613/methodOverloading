public interface MyInterface1 {

    void dontcall();//abstract method, can be overwritten
    static int IncreaseScore(){   //static method can't be overwritten
        System.out.println("Score Increased by 2");
        return 2;

    }
    private String brand(){
        return "Whiskey";
    }


    default String message(){

        System.out.println("Hellow, welcome memehhh");
        return "Hellow, welcome memehhh and drink ";//calling private method
    }

    default String message2(){
        System.out.println("Hey, you don't need to call this in main, just add");
        return "You  call this in main, just add"+brand();
    }
}


class Mysample implements MyInterface1{
     public void dontcall(){

        System.out.println("This is to overwrite abstract class");
        MyInterface1.IncreaseScore();
    }

    public String message(){

         return "Hey";
    }

    public String brand(){
        return "Whiskey2";
    }
   public static  void main(String[] args){

         Mysample ms= new Mysample();
         String resp= ms.message();
         //MyInterface1.IncreaseScore(); // this shows methods inside interface are
       //by default public, static and final
        // String s2= ms.brand();// gives error can't access private method outside class or interface
        System.out.println("Execution Complete and response of default = "+resp+
                " Brand over Riding === "+ms.brand());
    }

}
