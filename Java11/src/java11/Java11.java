package java11;



class A{
    void Nissan(){
        System.out.println("Life is a Race");
    }
  
}
class B extends A{
    void Nissan1(){
        System.out.println("Life is like a game");
    }
}

public class Java11{
    public static void main(String args[]){
        B ob=new B();
        ob.Nissan();
        ob.Nissan1();
        
    }
}