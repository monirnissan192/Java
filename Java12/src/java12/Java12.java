package java12;

// Hiararchical Inheritence: //

class A{
    float length=5;
    float bredth=2.4f;
  void Nissan(){
      System.out.println("Hiararchical working");
  }
}
class B extends A{
    float Nissan1(){
        return (length*bredth);
    }
}
class C extends A{
    float Nissan2(){
        return 2+(length*bredth);
    }
}

public class Java12{
    public static void main(String args[]){
        B ob1=new B();
        C ob=new C();
        ob.Nissan();
        System.out.println(ob1.Nissan1());
        System.out.println(ob.Nissan2());
    }
    }
