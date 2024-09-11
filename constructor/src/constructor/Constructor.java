
package constructor;
public class Constructor {
public static void main(String args[]){
    A a=new A("Nissan");
    a.set_age(20);
    a.get_age();
    System.out.println("Age is:"+a.get_age());
}
}
class A{
     int Age;
    public A(String Name){
     System.out.println("String Name is:"+Name);
    }

public void set_age(int age){
    Age=age;
}
public int get_age(){
   return Age;
  
}
}
