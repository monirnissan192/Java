
package java4;


public class Java4 {
int x,y;
Java4(){
    System.out.println("1 st constructor calling");
}
Java4(int i,int j){
    System.out.println("2nd constructor Calling");
    x=i;
    y=j;
}
Java4(Java4 obj){
  x=obj.x;
  y=obj.y;
}
  void Nissan(){
 System.out.println("The value of instance variable:"+x +y );
}
    
    public static void main(String[] args) {
       Java4 jv=new Java4();
       Java4 jn=new Java4(1,2);
       Java4 js=new Java4(jn);
       jv.Nissan();
       jn.Nissan();
       js.Nissan();
       System.out.println("Constructor overloading working and using class type object in the number of constructor 3");
    }
    
}
