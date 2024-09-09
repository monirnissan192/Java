

package javalab;

public class Javalab {

    
    public static void main(String[] args) {
        
    Cat cat=new Cat();
       cat.Eat();
       cat.Sleep();
       cat.Dia();
       
    }  
}
abstract class Animal{
    
abstract void Eat();
abstract void Sleep();
abstract void Dia();
}
class Cat extends Animal{
  void Eat(){
      System.out.println("Cat is Eating");
  }  
  void Sleep(){
      System.out.println("Cat is Sleeping");
  }
  void Dia(){
      System.out.println("Cat is Diaing");
  }
}


