// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main1 {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Main1 n = new Main1();
    // n.readchartoArray();
    // n.readFile("filepath");

    // array methods invoking a static method, meaning one copy of method is
    // avilable
    // for all object instantiation hence not eligible for over ride
    char[] arrayResponse = arraymethods();
    System.out.println(arrayResponse);
    // n.readFile("filepath");

    arrayFunctions a1 = new arrayFunctions();
    a1.arrayCopy(args);
    a1.arrayRange1();

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
  public void readchartoArray() {
    String temp = "ABVSDFVS";
    // String[] ch;
    for (int i = 0; i < temp.length(); i++) {
      // ch = String.valueOf(temp.charAt(i));
      System.out.println(temp);
    }
    // Type Conversion -1
    int temp1 = 260;
    byte b;
    b = (byte) temp1;
    System.out.println("value of byte b" + b);

    // 2
    int b1 = 121110;
    char a1 = (char) b1;
    System.out.print("Value of char" + a1);

  }

  public static char[] arraymethods() {

    String dupeText = "This is dupicate babai";
    char[] dupeTextArray = dupeText.toCharArray();
    // char [] dupearray= {dupeTextArray}; //can not assign array as dupearray
    // expecting elements
    System.out.println("Converted String to characters length are:" + dupeTextArray.length);
    // dupearray = new String[4];
    /*
     * Create 2-D array of 4*5 matrix showing seq numb and then 3^2 values
     * incremental
     */
    int i = 4;
    int j = 5;
    int k = 0;
    int[][] twoD = new int[i][j];

    for (i = 0; i < 4; i++) {
      for (j = 0; j <= i; j++) {
        twoD[i][j] = k;
        k++;
      }
    }

    for (i = 0; i < 4; i++) {
      for (j = 0; j <= i; j++) {

        if (j == i) {
          System.out.print(twoD[i][j] + "\n");
        } else {
          System.out.print(twoD[i][j] + " ");
        }
      }
    }
    System.out.println(System.getProperty("user.dir"));
    // JSONParser parser = new JSONParser();
    return dupeTextArray;
  }

  // Read lines and arrange in 2-D array as 1) [batter][topping] assign mood type
  // array based on toping 2)assign [batterID]////[ToppingID] 3) Randomize the
  // array selection based on mood. Then pull relevant ID's
  public static void readFile(String filepath) {

    try {

      FileReader readFile = new FileReader("/home/runner/PracticeJava/sample_json.json");

      BufferedReader bufferedReader = new BufferedReader(readFile);

      String line;

      while ((line = bufferedReader.readLine()) != null) {
        System.out.println("What is the file content:::: " + line);
      }

      bufferedReader.close();
    }

    catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }

  }

}
