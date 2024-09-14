package java9;
//   (GUI) Configaration Dialogs   //
import javax.swing.JOptionPane;

public class Java9{
    public static void main(String args[]){
        int option=JOptionPane.showConfirmDialog(null,"YES NO Statement");
        
        if(option==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"The YES Statement");
            System.out.println("I am Nissan");
        }
        else 
            if(option==JOptionPane.NO_OPTION){
             JOptionPane.showMessageDialog(null, "THe NO Statement");
                System.out.println("I am The winner");
            }
            else{
                JOptionPane.showConfirmDialog(null,"The CANCEL Statement");
           System.out.println("Nissan You Can Take Risk Because No Risk no Story");      
            }
    }
}