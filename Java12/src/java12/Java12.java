package java12;

// Multilevel Inheritence: //

class A{
    void Nissan(){
        System.out.println("Life is a Race");
    }
  
}
class B extends A{
    void Nissan1(){
        Nissan();
       System.out.println("Life is like a game");
    }
}
class C extends B{
    void Nissan2(){
        Nissan1();
        System.out.println("Yes Of course you see this");
    }
}

public class Java12{
    public static void main(String args[]){
        C ob=new C();
        ob.Nissan2();
        
        
        
    }
}