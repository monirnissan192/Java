package java14;
// Multiple inharitance using Composition
class Animal{
   public void Eat(){
        System.out.println("The Animal Eats Food");
    }
}
class Bird{
  public void Fly(){
       System.out.println("The Birds can Fly");
   } 
}
class Bat {
    
 private Animal animal=new Animal();
   private Bird bird=new Bird();
   
    public void Eat(){
     animal.Eat();
    }
    public void Fly(){
        bird.Fly();
    }
} 
public class Java14 { 
    public static void main(String[] args) { 
      Bat bat=new Bat();
      bat.Eat();
      bat.Fly();
      
    }
    
}