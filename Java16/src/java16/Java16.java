package java16;

class A{
    public void MethodA(){
            System.out.println("Method A Working");  
    }
}
   class B extends A {
    public void MethodB(){
       
     System.out.println("Method B Working");
    }
   }
   class C extends A {
    public void MethodC(){
  System.out.println("Method C Working");   
    }
   }
    class D extends A{
        public void MethodD(){
            System.out.println("Method D Working");
        }
    }
   public class Java16{
       public static void main(String[] args) {
           B ob=new B();
           C ob1=new C();
           D ob2=new D();
           ob.MethodA();
           ob.MethodB();
           ob1.MethodC();
           ob2.MethodD();
       }
   }
