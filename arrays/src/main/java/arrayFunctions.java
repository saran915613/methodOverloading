import java.util.Arrays;

public class arrayFunctions {
    static String S2;
    char[] c1 = {'a', 'b', 'l', 'e', 'l'};//instance variable (static array type), memory allocated as it is iniitalized
    char[] c2 = new char[c1.length]; //non-static or instance variable dynamic array type, memory allocated dynamically
    //All variables should refer to object through certain class, if you define class and not assign
    // object or value then null is assigned which is not a value or object or memory unit but a text represenationson
    //Above is instance variable, value will be related to that particular instance of state value.
    // They are mutable, meaning value can be
    /* Difference between primitive and non-primitive data type as below int vs integer*/
    String S1; //Null is assigned to variables that are not initialized with an object
    //Class Variable is also mutable in different way
    // value changes when any instances modifies the values in that instance, the updated value
    //reflected in all future instances

    //arrayFunctions af= new arrayFunctions();  // =====>>>>>>>>> Can not instantiate same class with in same calss as every time class loaded class is initiated and repeats
    //arrayFunctions.primitive();
    //primitive();
    public arrayFunctions() {
        //arrayFunctions af= new arrayFunctions();  // =====>>>>>>>>> Can not instantiate same class with in same class
        // as every time class loaded, object is initiated and calls the constructor which is same class.
        // Why does this error happens in compile time also although I am not willing to instantiate class explicitly
        //Ans: This is because when ever we compile JVM is loading , linking and initializing the class.
        // During initialization JVM allocates memory for class and initializes any static variables.
        //Now if your static variable involves initializing new instance of class this lead to infinite loop.
        //primitive(); Every method (other than a constructor) must have a return type or void.
        System.out.println("==========START::: Primitive Vs Non-Primitive complete======");
        primitive();

        System.out.println("==========END:::Primitive Vs Non-Primitive complete======");
        System.out.println("==========NULL VALUES======");
        whennullValues();
        System.out.println("==========INSTANCE VS CLASS Variable======");
        String[] iteration = {"1", "2", "3"};
        for (String iterate : iteration) {
            classVsinstanceVars(iterate);
            //classVsinstanceVars(iterate);
        }

    }

    public static void arrayRange1(char[] c1, char[] c2) {


        c2 = java.util.Arrays.copyOfRange(c1, 2, 5);
        for (char char1 : c2) {
            System.out.println("second output =====>" + char1);
        }

    }

    public void primitive() {

        int[] a = new int[5];

        a[0] = 1;
        System.out.println("Primitive dataType int value behaviour====>" + Arrays.toString(a));
        Integer[] a1 = new Integer[5];
        a1[0] = 1;
        System.out.println("Non-Primitive dataType Integer behaviour====>" + Arrays.toString(a1));
    }

    public void arrayCopy(String[] a1) {
        System.out.println("Entering array class");

        System.arraycopy(c1, 2, c2, 0, 3);
        System.out.println("First output is======>" + Arrays.toString(c2));
    }

    public void whennullValues() {

        System.out.println("Now we get NULL=====" + S1);

    }

    public void classVsinstanceVars(String indx) {

        S1 = S1 + indx;
        System.out.println("See Instance Variable S1 persisted, this is for Instance no." + indx +
                " and Value is ::" + S1);

        S2 = S2 + indx;
        System.out.println("See Class Variable S2 persisted, this is for Instance no." + indx +
                " and Value is ::" + S2 + " and is a string type., you can't add int to string");
    }
}