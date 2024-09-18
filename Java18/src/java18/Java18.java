package java18;

class Shape{
   private int length;
   private int breadth;
   Shape(int ln,int br){
   length=ln;
   breadth=br;
   System.out.println("1st Constructor shape");
   System.out.println("Length:"+length);
   System.out.println("Breadth:"+breadth);
   }        
   }

class Reactangle extends Shape{
   private String type;
   Reactangle(String ty,int ln,int br){
   super(ln,br); 
   type=ty;
   System.out.println("2nd constructor Reactangle");
   System.out.println("Type:"+ty);
}
}
class Coloredreactangle extends Reactangle{
   private String colour;
   Coloredreactangle(String col,String ty,int ln,int br){
   super(ty,ln,br);
   colour=col;
   System.out.println("3rd Constructor Colouredreactangle ");
   System.out.println("Colour:"+colour);
}
}

   public class Java18 { 
   public static void main(String[] args) { 
   Coloredreactangle cl=new Coloredreactangle("White","Good",5,8);
    }   
}
