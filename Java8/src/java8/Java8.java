package java8;

import java.util.Scanner;

public class Java8 {
    String Name;
    int Id;
    String Marks,Marks1;
    void getInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        Name=sc.nextLine();
        System.out.println("Enter the Id:");
        Id=sc.nextInt();
        System.out.println("Enter the Marks:");
        Marks1=sc.nextLine();
        Marks=sc.nextLine();
    }
    void Show(){
        System.out.println("My Name is :"+Name);
        System.out.println("My Id is :"+Id);
        System.out.println("My Marks is:"+Marks);
    }
    
    public static void main(String args[]) {
     Java8[] sc=new Java8[2];
     for(int i=0;i<sc.length;i++){
       sc[i]=new Java8();
       sc[i].getInfo();
     }
     for(int i=0;i<sc.length;i++){
       sc[i].Show();
     }
     
     }
     
      
    }