public class person {

    private double height;
    private String name;
    private double weight;

    private static int eyes;
    private static int ears;
    private static int hands;
    private static int legs;

    static {
        eyes = 2;
        ears = 2;
        hands = 2;
        legs = 2;

    }
    private static int count;
    {
        count++;
    }

    public person(String name, double height, double weight){

        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public static void setEyes(int eyes) {
        person.eyes = eyes;
    }

    public static int getEyes() {
        return eyes;
    }

    public static void setEars(int ears) {
        person.ears = ears;
    }

    public static int getEars() {
        return ears;
    }

    public static void setHands(int hands) {
        person.hands = hands;
    }

    public static int getHands() {
        return hands;
    }

    public static void setLegs(int legs) {
        person.legs = legs;
    }

    public static int getLegs() {
        return legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name +" is sleeping.");
    }

    public void learn() {
        System.out.println(name +" is learning.");
    }

    @Override
    public String toString() {
        return	"Personal details\n" +
                "  eyes\t: " + eyes  + "\n" +
                "  ears\t: " + ears  + "\n" +
                "  hands\t: "+ hands + "\n" +
                "  legs\t: " + legs  + "\n" +
                "  name\t: " + name  + "\n" +
                "  height: " + height+ "\n" +
                "  weight: " + weight;
    }

}
