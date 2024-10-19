import java.util.Arrays;

public class arrayFunctions {
  char[] c1 = { 'a', 'b', 'l', 'e', 'l' };
  char[] c2 = new char[c1.length];

  public void arrayCopy(String[] a1) {
    System.out.println("Entering array class");

    System.arraycopy(c1, 2, c2, 0, 3);
    System.out.println("First output is======>" + Arrays.toString(c2));
  }

  public void arrayRange1() {

    
     c2 = java.util.Arrays.copyOfRange(c1,2,3);
    for(char char1:c2)
    {
      System.out.println("second output =====>"+char1);
    }
    
  }

}
