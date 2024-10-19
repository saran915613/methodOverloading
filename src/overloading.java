public class overloading {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value"; // constant variable so that it can be reused ouside the method
    public static void main(String[] args){
       // double foot = 0.0;
      //  double inches = 0.0;
        double totalFeetandInchesToCM= calcFeetAndInchesToCentimeters(1,1);
        System.out.println("Total Foot and Inches to CM " +totalFeetandInchesToCM);
        double totalfeetinInchess1 = calcFeetAndInchesToCentimeters(156);
        calcFeetAndInchesToCentimeters();
        System.out.println("Total inches " +totalfeetinInchess1);
        int minutes;
        int seconds;
        String result = getDurationString(58,1);
        //the result of the method is very relative to the line number of the code execution.
        System.out.println("First Time is:"+result);
        String result2 = getDurationString(57);
       // int hours;
        System.out.println("Second Time is:"+result2);
        //this can also be intrepreted as below:
        System.out.println(getDurationString(57));

    }
    public static double calcFeetAndInchesToCentimeters(double foot, double inches){
        if (foot >= 0 && (inches>=0)){
           // return -1;
            double totalcm = (foot*30.480)+(inches*2.54) ;
         System.out.println("Total Foot and Inches to CM  :" +totalcm);
         return totalcm;
        }
        else {
            System.out.println("Not Valid");
            return -1;
        }
    }

     public static String calcFeetAndInchesToCentimeters()
     {
         return INVALID_VALUE_MESSAGE;
     }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches>=0 ){
            // return -1;
            double totalfeet = (inches*0.083333) ;
            double totalcmfrominches= calcFeetAndInchesToCentimeters(totalfeet,inches);
            System.out.println("totalcmfrominches :" +totalcmfrominches);
            return totalcmfrominches;
        }
        else {

            System.out.println("Not Valid");
            return -1;
        }
    }

    public static String getDurationString(int min, int sec) {

           if(min >=0 && (sec>=0 && sec <= 59)){
               int qhr = min/59;
               int qmin = min%59;
               return (qhr+"h "+qmin+"m "+sec +"sec ");
           }

           else
           {
               return INVALID_VALUE_MESSAGE;
           }

    }

    public static String getDurationString(int sec) {

        if(sec>=0 && sec <= 59){
            int qmin1 = sec/59;
            int qsec1 = sec%59;
            System.out.println("Second qmin: "+qmin1+" Second qsec1: "+qsec1);
            return getDurationString(qmin1,qsec1); // returns the output of the called method

        }

        else
        {
            System.out.println("Failed in second method");
            return INVALID_VALUE_MESSAGE;
        }


    }
}

/* Always use method overloading just with different signatures so that you are efficient and easy to remember this causes method redability  */
/////////////////////////////////////////////////////////////////

