
package java5;



public class Java5 {
private int Age;
 public Java5(String Name){
     System.out.println("My Name is :"+Name);   
 }
 void Nissan(int Age ){
    this.Age=Age;
 }
 int Result(){
     
     System.out.println("Your age is: "+Age);
     return 0;
 }
    public static void main(String[] args) {
        
        Java5 jv=new Java5("Md.Monir Ahmed");
        jv.Nissan(20);
        jv.Result();
   //To eliminate the confussion between class attributes and parameters with same name that's why we use this.keyword//     
    }
    
}
