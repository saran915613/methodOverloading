import static java.lang.System.out;

public class testSwitch {

    public static void main(String[] args) {
        int stch = 1;
        int stch1 = 2;
      String name = "Saran";
        out.println("This is using jdk 20 with 2 variations of writing Switch \n  and \n" +
                "\n" +
                "name check appears to be :"+getName(name));
        char character = 'B';

        switch (stch) {
            case 1:
                out.println("Value was 1");
                break;
            case 2:
                out.println("The value is 2");
            default:
                out.println("This is default method");
        }
        String month = "January1";
        out.println("this " + month + " is in " + getMonth(month));
        out.println(" this "+month+" is in "+secondQuarter(month));
        out.println("the letter "+character+" has NATO character"+getNATOchar(character));


    }

    public static String getMonth(String month) {
        switch (month) {

            case "January":
            case "February":
            case "March":
                out.println("This is 1st Quarter");
                return "This is 1st Quarter";
            default:
                break;
        }

        return "Bad Month Input";
    }


    public static String secondQuarter(String month) {

        switch(month) {
            case "April":
                out.println("Ain't you the fool");
            case "May":
            case "June":
                return ("2nd Quarter");
            default:
                break;
        }
            return "Invalid input ";
    }
    public static String getNATOchar(char character){
         int day = 1;
        switch (character) {

            case 'A':
                return "A = Able ";
            case 'B':
                return "B = Baker";
            default:
                break;
        }
        return "Not Found";
        }
   public static char getName(String name){

        return switch(name){
            case "Saran" -> { yield 'T';
            }
            case "Varun","Marun" ->{yield 'F';}
            default -> {

                out.println("Wrong Name"+name);
                throw new IllegalStateException("Unexpected value: " + name);
            }
        };

        //return 'Y';
   }

    }


/*
public class NumberInWord {
    // write your code here

    int num ='1' ;
    System.out.println("Number "+printNumberInWord(num));

    public static int printNumberInWord(int num){
        return switch(num){
            case 1 -> {yield 'ONE';}
            case 2-> {yield 'TWO'}
            default -> {yeild System.out.println("None");}
        }
    }
  }
*/

