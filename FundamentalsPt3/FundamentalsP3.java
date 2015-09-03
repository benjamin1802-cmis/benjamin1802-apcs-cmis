

import javax.swing.JOptionPane;
public class FundamentalsP3
    {
    public static void main ( String[] args)
        {
        String input = JOptionPane.showInputDialog("Insert a number.");
        int numero = Integer.parseInt(input);
        
        if (numero%2 == 0)
            {
            System.out.println(input + " is an even number."); 
                
            }//end if
        else
            {
            System.out.println(input + " is an odd number.");
                
            }//end else
            
        }//end main
        
        
    }//end class FundamentalsP3
