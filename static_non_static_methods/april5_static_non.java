public class april5_static_non {

   static String bankName;
   static String branchName;
   static String ifsc;

   long accNum = 111133333;
   //long anu = this.accNum;

   private String accHName;
   private static double balance;

      static void initializeStaticFields() {

      bankName = "Chase";
      branchName = "Austin";
      ifsc = "XXXXXX121324";
      int Account = 54565324;
      // accNum = 55.3333; Non-Static Field Can not be ref inside static block
       //  System.out.println("this value here is"+accNum);
      }
   void thisvaluedemo() {
      System.out.println("this value here is: " + this.accNum);
   }
      void initializenonStaticFields(){
         System.out.println("new this value here set from main==>"+this.accNum);
          accNum = 5343433;
          accHName= "Saran Bhagavathula";
         System.out.println("this value after setting inside method  is==>"+this.accNum);

          //balance = 50000;
          return; // simple return is same as not writing, when not writing jvm automatically adds it
      }

      void deposit(double inputMoney){
      balance = inputMoney+balance;
      //return balance
         System.out.println("Total Deposit Balance = "+balance);
      }

      void withdraw(double inputMoney){

      balance = balance - inputMoney;
         System.out.println("Money WithDrawn: "+balance);

      }

      void currentBalance(){
         System.out.println("CurrentBalance = "+balance);
      }


   }


