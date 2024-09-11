

package javalab;

public class Javalab {
public static void main(String[] args) {
     Bmw bmw=new Bmw();
     bmw.Brand();
     bmw.Model();
     bmw.NumofWheel();
     bmw.IsTopsportsBrand();
   
       
    }  
}
     
abstract class Car{
   int wheels=4; 
abstract void Brand();
abstract void Model();
abstract void NumofWheel();
}
interface TopSportsBrand{
    abstract void IsTopsportsBrand();
}
class Bmw extends Car implements TopSportsBrand{
  void Brand(){
      System.out.println("Bmw Brand");
  }  
  void Model(){
      System.out.println("2018");
  }
  void NumofWheel(){
      System.out.println(wheels);
  }
  public void IsTopsportsBrand(){
      System.out.println("The car is Bmw");
  }
}




