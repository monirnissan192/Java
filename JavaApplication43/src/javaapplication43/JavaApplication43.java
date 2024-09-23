
package javaapplication43;

import java.util.Scanner;

class User{
    private String UserName;
    private String Password;
    private int Key;
    Scanner sc=new Scanner(System.in);
    User(String UserName,String Password){
        this.UserName=UserName;
        this.Password=Password;
        System.out.println("Your Name Is: "+UserName);
        System.out.println("Your Password Is: "+Password);
    }
    public String GetPass(){
        return Password;
    }
    public void SetKey(){
    System.out.print("Enter Your Encryption key:"); 
    Key=sc.nextInt();
    }
    public int GetKey(){
   return Key;
    }
    public void Display(){
    System.out.println("Your Encryption Key Is :"+Key);    
    }
}

class Server extends User{
    
 private char[]encrypted_Pass;
 Server(String UserName,String Password){
     super(UserName,Password);
 }
 public void Encryption(){
   int key=GetKey();
   String Password=GetPass();
   char[]Pass=Password.toCharArray();
   encrypted_Pass=new char [Pass.length];
   System.out.print("Encrypted Password: ");
   for(int i=0;i<Pass.length;i++){
    encrypted_Pass[i]=(char)(Pass[i]+key);
       System.out.print(encrypted_Pass[i]);
   }
  System.out.println();
 }
 
 public void Decryption(){
 int key =GetKey();
 System.out.print("Decrypted Password: ");
 for(int i=0;i<encrypted_Pass.length;i++){
 char Decrypted=(char)(encrypted_Pass[i]-key);
System.out.print(Decrypted);
 }
 System.out.println();
 }
 public void Login(String Dp,String Ep){
 String Login_Pass;
 System.out.println("Enter Your Login Password:");
 Login_Pass=sc.next();
 if(Login_Pass.equals(Dp)){
 System.out.println("Login Successful");   
 }
 else if(Login_Pass.equals(Ep)){
 System.out.println("Sorry you trying with encrypted Password");    
 }
 else{
     System.out.println("Wrong Password");    
 }
 }
 
}
public class JavaApplication43 {    
public static void main(String[] args) {
 Server sv=new Server("Monir Nissan","Vu");
 //sv.GetPass();
 sv.SetKey();
// sv.GetKey();
 sv.Display();
 sv.Encryption();
 sv.Decryption();
 String Dp=sv.GetPass();
 sv.Login(Dp,"YX");
}
}
