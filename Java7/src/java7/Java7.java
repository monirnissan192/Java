
package java7;


public class Java7 {


public  void foo(){
    System.out.println("Foo");
}
    
    public static void main(String[] args) {
      Java7[] sc=new Java7[10];
      for(int i=0;i<10;i++){
          /*sc[i]=new Java7();
          // sc[i].foo();
          //you can write this
*/
       (sc[i]=new Java7()).foo(); 
       
      // you can write this
       //this is the way to create Array object//
       
      }
        
    }
    
}
