
package mid1;

import java.util.Scanner;


public class Mid1 {
String Cheak;
int Num1;
int Num2;
void Nissan(){
    Scanner sc=new Scanner(System.in);
    Num1=sc.nextInt();
    for(int i=0;i<Num1;i++){
        Num2=sc.nextInt();
        Cheak=(Num2%2==0)?"This is Even Number"+i:(Num2%2==1)?"This is Odd Number"+i:"Default";
        System.out.println(Cheak);
    }
    
}
    
    public static void main(String[] args) {
      Mid1 ob=new Mid1();
      ob.Nissan();
    }
    
}
