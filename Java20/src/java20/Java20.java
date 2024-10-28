
package java20;

class Singleton{
    
 private static Singleton instance=new Singleton();
 
 public Singleton(){}
 
 public static Singleton getinstance (){
 System.out.println("Object is Created");
 return instance;
 }
 void Display(int A,int B){
 int Sum=A+B;
 int Sub=A-B;
 
 System.out.println("Summation Of A+B="+Sum);
 System.out.println("Subtraction Of A-B="+Sub);

 }
 }

public class Java20 {
    public static void main(String[] args) {
     Singleton ob=Singleton.getinstance();
     ob.Display(20, 10);
     System.out.println("This is Singleton Design Pattern");
    }
    }
