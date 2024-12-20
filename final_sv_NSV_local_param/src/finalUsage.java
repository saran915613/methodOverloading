import java.util.ArrayList;
import java.util.List;

public class finalUsage {
    static final List a1;//= new ArrayList();
    static int a5 ;
    private final int counter;
    String car_name = "Ford";

    static {
        a1 = new ArrayList();
        a1.add("static block carName TESLA");
        System.out.println("=== { 1. added a1 static final var values in SB BLock");
        System.out.println("      2. a24 static final var RRR applied for this - " + finalUsage.a24 );
        System.out.println("      3. a2 static var RRR NOT applied for this - " + finalUsage.a2 + " } ");
        System.out.println("      4. a5 static var RRR NOT applied BUT final static var is not blank var it has default values - " + finalUsage.a5 + " } ===");
        a5=10;
    }

    static final int a24 = 24;
    static int a2 = 2;

    {
        a1.add(this.car_name);
        //a1 = new ArrayList();
        System.out.println("1.1 Incrementing final var values in NSB : " + a1.toString());
    }

    static List return1(List l1) {

        return l1;
    }

    public finalUsage() {
        counter = 2;
        int l1 = counter;
        System.out.println("Incremented NSV final Counter value" + counter);
        //need to initialize inside every constructor
    }

    public finalUsage(int l2) {
        // this(); //ideally better to avoid this and final variable
        counter = 1;
        l2 = counter + l2;
        System.out.println("Incremented NSV final Counter value" + counter);
        //return l2;
    }

}
