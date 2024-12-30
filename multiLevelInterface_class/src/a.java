interface a {
    //void a();
    String ring();
    interface a1{
        String subRing();
    }

    static void main() {
        System.out.println("Welcome to static Main");
    }
}
abstract class B1 implements a, a.a1 {
    //  this could be termed as multi type inheritence
    abstract void main2();

}


