public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");
        Container c1 = new Container(5);
        System.out.println("getItem value of C1 is : "+c1.getItem());
        helper(c1);
        System.out.println("**Unchanged c1 value in pass by val is : "+c1.getItem());
        helper1(c1);
        System.out.println("***Changed c1 values in pass by ref is : "+c1.getItem());
    }

    public static void helper(Container p){

        System.out.println("Observe Pass by value C1 is stored in p but change in p is not impacted");
        p = new Container(p.getItem()+1);
        System.out.println("getItem value of p is : "+p.getItem());

    }

    public static void helper1(Container p) {

        System.out.println("Now setItem Value impact original c1 obj ref as only duplicate ref value stored in p pointing to same " +
                "obj location hence value is changed everywhere "+p.setItem(p.getItem()+1)); //here we havent' created new object so change here is reflected for c1 as well

    }
}

// Pass by  Reference for Object      s

