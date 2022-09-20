public class overloading {

    public static void main(String[] args){
        double foot = 0.0;
        double inches = 0.0;
        double totalFeetandInchesToCM= calcFeetAndInchesToCentimeters(1,2);
        double totalFeetInInches = calcFeetAndInchesToCentimeters(5);
    }
    public static double calcFeetAndInchesToCentimeters(double foot, double inches){
        if (foot >= 0 && (inches>=0 && inches <= 12)){
           // return -1;
            double totalcm = (foot*30.480)+(inches*2.54) ;
         System.out.println("Total Foot and Inches to CM Calculated :" +totalcm);
         return totalcm;
        }
        else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches>=0 && inches <= 12){
            // return -1;
            double totalfeetinInches = (inches*0.083333) ;
            System.out.println("Total inches to feet Calculated :" +totalfeetinInches);
            return totalfeetinInches;
        }
        else {
            return -1;
        }
    }
}

