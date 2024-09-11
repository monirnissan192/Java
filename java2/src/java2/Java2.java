
package java2;

public class Java2 {
Java2(){
 System.out.println("I am a Constructor");   
}

Java2(String Name){
    System.out.println("Name is "+Name);
}
void Nissan(){
    System.out.println("I am not a constructor");
}
    public static void main(String[] args) {
     Java2 jv=new Java2();
     Java2 jn=new Java2("Nissan");
     jv.Nissan();
    }
    
}
