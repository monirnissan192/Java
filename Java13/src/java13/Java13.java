
package java13;

// Multiple inheritance

interface  Animal{
    void Eat();
}
interface Bird{
    void Fly();
}
class Bat implements Animal,Bird{
    
    @Override
    public void Eat(){
        System.out.println("Animal Eating Food");
    }
    @Override
    public void Fly(){
        System.out.println("Birs can flying");
    }
}
public class Java13{
    public static void main(String[] args) {
     Bat sc=new Bat();
     sc.Eat();
     sc.Fly();
    }
    
}