
package java3;


public class Java3 {
int x;
Java3(){
    System.out.println("Java3 is a constructor");
    x=0;
}
Java3(int i){
    System.out.println("2nd constructor called");
    x=i;
}
Java3(double i){
    System.out.println("3rd constructor called");
    x=(int)i;
}
void Nissan(){
    System.out.println("This code is mainly Based on Constructor Overloading"+x);
}
    
    public static void main(String[] args) {
        Java3 jv=new Java3();
        Java3 jn=new Java3(2);
        Java3 jb=new Java3(3.1);
        jv.Nissan();
        jn.Nissan();
        jb.Nissan();
    }
    
}
