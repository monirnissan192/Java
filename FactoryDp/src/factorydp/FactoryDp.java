
package factorydp;
interface Shape{
 public void Draw();  
}

class Cercel implements Shape{
@Override
public void Draw(){
System.out.println("Cercel is Drawing");    
  }  
}
class Square implements Shape{
@Override
public void Draw(){
System.out.println("Square is Drawing");    
  }  
}
class Rectangle implements Shape{
@Override
public void Draw(){
System.out.println("Rectangle is Drawing");    
  }  
}
class ShapeFactory{
public Shape getShape(String type){
switch(type.toLowerCase()){
    
    case "cercel":
    return new Cercel();
    case "square":
    return new Square();
    case "rectangle":
    return new Rectangle();
    default:
    return new Cercel();
}  
} 
}

public class FactoryDp {
 public static void main(String[] args) {
  ShapeFactory ob = new ShapeFactory(); 
  Shape test=ob.getShape("Cercel");
  test.Draw();
  test=ob.getShape("Square");
  test.Draw();
  test=ob.getShape("Rectangle");
  test.Draw();
  System.out.println("Design Pattern code");
    }
}
