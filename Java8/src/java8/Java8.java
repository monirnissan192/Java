package java8;

import java.util.Scanner;

public class Java8 {
    String Name;
    int Id;
    double Marks;
    void getInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        System.out.println("Enter the Id:");
        System.out.println("Enter the Marks:");
        Name=sc.nextLine();
        Id=sc.nextInt();
        Marks=sc.nextDouble();
    }
    void Show(){
        System.out.println("My Name is :"+Name);
        System.out.println("My Id is :"+Id);
        System.out.println("My Marks is:"+Marks);
    }
    
    public static void main(String args[]) {
     Java8[] sc=new Java8[2];
     for(int i=0;i<2;i++){
        sc[i]=new Java8();
        sc[i].getInfo();
       
     }
     for(int i=0;i<2;i++){
         sc[i].Show();
     }
    }
}