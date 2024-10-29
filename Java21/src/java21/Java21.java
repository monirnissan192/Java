package java21;

 abstract class Vehicle{
     
     Vehicle(){}
     
     public void Drive(){}
     
 }
class Cycle extends Vehicle{
    Cycle(){
    System.out.println("Cycle Object Created");    
    }
    @Override
     public void Drive(){
    System.out.println("Driving a Cycle");    
    }
    
}
class Bike extends Vehicle{
    Bike(){
    System.out.println("Bike Object Created");    
    }
    @Override
     public void Drive(){
    System.out.println("Driving a Bike");    
    } 
}
class Car extends Vehicle{
    Car(){
    System.out.println("Car Object Created");    
    }
    @Override
     public void Drive(){
    System.out.println("Driving a Car");    
    }   
}
class Factory{
public Vehicle getinstance(String Type){

    switch(Type.toLowerCase()){
        case "cycle":
        return new Cycle();
        
        case "bike":
        return new Bike();
        
        case "car":
        return new Car();
        
        default:
        return new Cycle();
    }
  }  
}
public class Java21 {   
public static void main(String[] args) {
    
Factory ob=new Factory();

Vehicle test= ob.getinstance("cycle");
test.Drive();

 test= ob.getinstance("bike");
test.Drive();

 test= ob.getinstance("car");
test.Drive();

System.out.println("Factory Design Pattern");

    }  
}