import java.util.Scanner;

public class Main {

    double getROI() {
        System.out.println("BANK 4% ROI ");
        return 4;
    }

    double getROI(int i) {
        System.out.println("BANK 4% ROI ");
        return 4;
    }

    static double getPrinciple(double i1) {
        System.out.println("BANK Principle Amount is: "+i1);
        return i1;
    }

    static String getPrinciple(double i1, String j1) {
        System.out.println("BANK Principle Amount is: ");
        return "name is - " + j1 + "amount is : " + i1;
    }

    public static void main(String[] args) {
        System.out.println("Start OverRide methods, please enter Interest Rate !");
        Scanner sc = new Scanner(System.in);
        int I = sc.nextInt();
        if (I == 8) {
            HDFCBank h1 = new HDFCBank();
            h1.getROI();
            System.out.println("Method OverRidden with HDFC Bank");
        } else if (I == 6) {
            BOABank b1 = new BOABank();
            b1.getROI();
            System.out.println("Method OverRidden with BOA Bank");
        } else if (I == 7) {
            Main c1 = new CitiBank(); // super class ref and sub class object
            c1.getROI();
            c1.getPrinciple(4000); //Static method inheritance doesn't over ride only hide
            //can be retrvied based on class name. Here c1 is Main

        }
    }
}
