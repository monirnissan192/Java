
package java10;
// GUI Configaration Dialogs
import javax.swing.JOptionPane;


public class Java10 {

    
    public static void main(String[] args) {
        int option=JOptionPane.showConfirmDialog(null," YES NO Statement");
        switch(option){
            case JOptionPane.YES_OPTION:
                System.out.println("I Am Nissan");
                break;
            
            case JOptionPane.NO_OPTION:
                System.out.println("I Am The Winner");
                break;
            default:
                System.out.println("No Risk No Story");
                break;
                 
            
        }
         System.out.println("Using Swith Case");
    }
    
}
