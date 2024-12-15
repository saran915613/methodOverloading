public class extensionHariclass extends person {

    private static String institute;
    private int sno;
    private String course;
    private double fee;

    static {
        institute = "NiT";
    }

  public extensionHariclass(int sno, double fee, String Course, String name, double height, double weight){

        super(name,height,weight);

        this.sno = sno;
        this.course = course;
        this.fee = fee;
}


public static void setInstitute(String institute){
    extensionHariclass.institute = institute;
}

public static String getInstitute(){
      return institute;
}
    public void String setSno(int sno){
        this.sno = sno;
    }
public int getSno(){
      return sno;
}

public void setCourse(String course){

      this.course = course;
}
    public String getCourse(String course){

        return course;
    }
    public void setFee(double fee){
      this.fee = fee;
    }

    public double getFee(){
      return fee;
    }

    public void listen(){
        System.out.println(getName()+" is listening "+course);
    }
    public void reply(){
        System.out.println(getName()+" is replying to "+course+" questions ");
    }

    @Override
    public  String toString(){
      return super.toString() + "\n" +
              "\n Student details" +      "\n"+
              "institute\t:" +institute+  "\n"+
              "sno\t\t: "    +sno+        "\n"+
              "course\t\t: " +course+     "\n"+
              "fee\t\t: "    +fee+"\n";
    }

}

