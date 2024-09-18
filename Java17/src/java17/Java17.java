package java17;

class Shape{
    private int length;
    private int breadth;
    Shape(){
        length=0;
        breadth=0;
        System.out.println("Default Constructor Shape");
    }
}
class ReactAngle extends Shape{
    String type;
    ReactAngle(){
     super();  
      type=null; 
        System.out.println("Default Constructor ReactAngle");
    }
}
class ColoredReactaggle extends ReactAngle{
    String Colored;
    ColoredReactaggle(){
        super();
        Colored=null;
        System.out.println("Default Constructor ColoredReactangle");
    }  
}
public class Java17{
    public static void main(String[] args) {
     ColoredReactaggle CR=new ColoredReactaggle();   
    }
}