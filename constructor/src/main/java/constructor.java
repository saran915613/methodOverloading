public class constructor extends inherit {
    public constructor() {
       super();
       /*  Call to superclass constructor although optional since default constructor is
        declared in inherit class.
        you are trying to inherit a class into sub class and then to call
         * parent class u need to call it's constructor  */
        System.out.println("This is to see if I need to specify the constructor of the parent class");

    }
    // *****************
    private String name = "class Y"; //instance property
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // *****************
    public String commmand() {

        return "ls";
    }
    public static String commmand2() {

        return "df";
    }

    public static void main(String... args) {
        //Classic case of creating object with reference type to child and parents clas
        constructor c1 = new constructor();
         String sample = commmand2(); // to show I can read static class
        String com = c1.commmand();
        //Can also access parents class method
        String v1 = c1.inherit();
        System.out.println("Executing first command = " + com);
        c1.getSystemCommand(com);
        System.out.println("Executing first command = " + v1);
        c1.getSystemCommand(v1);
        // Same example will execute only command ls
        inherit I1 = new constructor();
        //String com2 = I1.inherit();
        String com2 = ((constructor) I1).commmand2();
        System.out.println("Executing 2nd command= " + com2);
        I1.getSystemCommand(com2);
        System.out.println("=====Second command Execution is complete====");
        //The below shows that u can access parent directly via I1 object
        String v2 = I1.inherit();
        System.out.println("Executing first command = " + v2);
        c1.getSystemCommand(v2);

        //If we run the same test for the instance properties below is the result
        // TIP: for you to print class x of inherit, you should not overide in class constructor
        System.out.println("Where are you getting this from === "+I1.getName());


    }

}
