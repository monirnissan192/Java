package java6;


public class Java6 {
 private double radious;
 Java6(double radious){
     this.radious=radious;
 }
 Java6(){
     this(1.0);
 }
 public double getArea(){
 return this.radious*this.radious*Math.PI;
     
 }
 
    public static void main(String[] args) {
    Java6 sc = new Java6(2.3);
    Java6 sC = new Java6();

    // Store the result and then print
    double area1 = sc.getArea();
    System.out.println("Area of sc: " + area1);

    // Directly print the returned value
    System.out.println("Area of sC: " + sC.getArea());
}
}
     