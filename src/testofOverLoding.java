public class testofOverLoding {

    public static void main(String[]  args){

        System.out.println("Inches in cm is "+calculateinCM(50.5552));
        //System.out.println("Will write below");
        System.out.println("Time in Hours is"+hours(6));
    }

    public static double calculateinCM(double inches){

        return inches*2.54;
    }

    // time in secs and remaining time

    public static double hours(double seconds){

        return seconds/3600;
    }
}

