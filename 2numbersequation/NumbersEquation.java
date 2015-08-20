import javax.swing.JOptionPane;  

public class NumbersEquation{  
  public static void main ( String args [] ) 
 {  
   double sum = 0;
   
   String Onek = JOptionPane.showInputDialog( "Insert a Number." );
   String Twok = JOptionPane.showInputDialog( "Insert another Number." );
   
    double one = Integer.parseInt ( Onek );
    double two = Integer.parseInt ( Twok );
        
        double One = one + two;
        double Two = one - two;
        double Three = one * two;
        double Four = one / two;
        double Five = one % two;
   
        System.out.println(Onek + " + " + Twok + " = " + One + "\n");
        System.out.println(Onek + " - " + Twok + " = " + Two + "\n");
        System.out.println(Onek + " * " + Twok + " = " + Three + "\n");
        System.out.println(Onek + " / " + Twok + " = " + Four + "\n");
        System.out.println(Onek + " % " + Twok + " = " + Five + "\n");   
 }  // end main
}   // end class NumbersEquation