public class b extends B1{
    // although this could be termed as single level inheritence, the super() of interface is object
    //object is the super class of all classes abstract, interface methods.
    //extension of interface from class not possible coz interface super is object only not a class constructor
    @Override
    public String ring() {
        return "Hello override Interface from b";
    }

    @Override
    public String subRing() {
        return "Hello override innerInterface from b";
    }

    public void main2(){
        System.out.println("Welcome Non Static abstract OverRide Main2 from b");
    }
    public void main3(){
        System.out.println("Welcome  Main3 from class b");
    }

    }

