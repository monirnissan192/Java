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
class C extends B{
    float Nissan2(){
        return 2+(length*bredth);
    }
}

public class Java12{
    public static void main(String args[]){
        C ob=new C();
        ob.Nissan();
        System.out.println(ob.Nissan1());
        System.out.println(ob.Nissan2());
    }
    }
