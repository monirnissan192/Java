
package java15;

// Hybrid Inheritence
class Animal{
    abstract void Eat(){
        System.out.println("");
    }
}
interface Bird{
 abstract void Fly();
}
interface Cat{
  abstract void Sleep();
}
class Bat extends Animal implements Bird,Cat{
    
    @Override
    public void Eat(){
        System.out.println("Animan is better than fake people");
    }
    @Override
    public void Fly(){
        System.out.println("Birds can Fly");
    }
    @Override
    public void Sleep(){
        System.out.println("Now cat is Sleeping");
    } 
}
public class Java15{
    public static void main(String[] args) {
     Bat sc=new Bat();
     sc.Eat();
     sc.Fly();
     sc.Sleep();
    }
}
