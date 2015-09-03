import javax.swing.JOptionPane;

public class FundamentalsPt2
    {
    public static void main ( String[] args)
        {
       String a = JOptionPane.showInputDialog("Insert a Number ");
       String b = JOptionPane.showInputDialog("Insert Another Number ");
       
       int numeroA = Integer.parseInt(a);
       int numeroB = Integer.parseInt(b);
       
       if (numeroA > numeroB)
            {
            System.out.println("The value of a is " + a + " and it is greater than b whose value is " + b + ".");
            }// end if
       else if (numeroA < numeroB)
           {
            System.out.println("The value of a is " + a + " and it is less than b whose value is " + b +  ".");
           }// end else
       else
           {
           System.out.println("The value of a is " + a + " and it is equal to b whose value is also " + b + ".");    
            }
        }// end method Main
        
    }// end class FundamentalsPt2