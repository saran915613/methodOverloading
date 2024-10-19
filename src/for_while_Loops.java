public class for_while_Loops {

    public static void main(String[] args){

        System.out.println("0 is "+(isPrime(0)?"": "NOT")+"a prime number");
        System.out.println("1 is "+(isPrime(1)?"":"NOT")+"a prime number");
        System.out.println("2 is "+(isPrime(2)?"":"NOT")+"a prime Number");
        System.out.println("3 is "+(isPrime(3)?"":"NOT")+"a prime number");
        System.out.println("4 is "+(isPrime(4)?"":"NOT")+"a prime number");
        System.out.println("5 is "+(isPrime(5)?"":"NOT")+"a prime number");
        System.out.println("6 is "+(isPrime(6)?"":"NOT")+"a prime number");
        System.out.println("7 is "+(isPrime(7)?"":"NOT")+"a prime number");
        System.out.println("8 is "+(isPrime(8)?"":"NOT")+"a prime number");
        System.out.println("9 is "+(isPrime(9)?"":"NOT")+"a prime number");
        System.out.println("10 is "+(isPrime(10)?"":"NOT")+"a prime number");

        for (double interest =0; interest <10; interest++) {
            interest = interest + 0.25;
            if (interest > 4) break;
            System.out.println("For the IntrestRate "+interest+"  Total amount would be" +
            calculateInterestRate(1000,interest));
     // assignment

        }

        int j = 100;

        while (j<250){
            j=j+10;
            System.out.println("Checking the code for while loop"+j);

        }
        do {
            System.out.println("Entered value of J"+j);
            if (j%25==0){
                System.out.println("value of J"+j);
                //break;
            }
        }while (false);
        // assignment
        int count = 0;
        int sumofj = 0;
        for (int j1 =1; j1<1000;j1++) {

            if (j1 % 3 == 0) {

                count = count + 1;
                sumofj = j1 + sumofj;
                System.out.println("Condition Met for " + j1);

                if (count == 5) {
                    System.out.println("total sum" + sumofj);
                    break;
                }

            }


        }

    }

    public static boolean isPrime(int i) {
        if (i<=2) {
          return (i==2);
            //return false;
        }
        for (int divisor=2; divisor <i; divisor++){
            if (i%divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterestRate(double amount, double intrest)
    {
        return   amount * (intrest/100);

    }


}
