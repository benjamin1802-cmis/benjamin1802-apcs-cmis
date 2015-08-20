import javax.swing.JOptionPane;  

public class TwoNumbersMath{  
  public static void main ( String args [] ) 
 {  
   float sum = 0;
   
   String first = JOptionPane.showInputDialog( "Insert a Number." );
   String second = JOptionPane.showInputDialog( "Insert another Number." );
   
   float one = Float.parseFloat ( first );
   float two = Float.parseFloat ( second );
   
   sum = one + two ;
   System.out.println ( first +"+"+ second +"="+ sum );
   System.out.println ( second +"+"+ first +"="+ sum );   
   sum = one - two ;
   System.out.println ( first +"-"+ second +"="+ sum );
   sum = two - one ;
   System.out.println ( second +"-"+ first +"="+ sum );   
   sum = one * two ;
   System.out.println ( first +"*"+ second +"="+ sum );
   System.out.println ( second +"*"+ first +"="+ sum );
   sum = one / two ;
   System.out.println ( first +"/"+ second +"="+ sum ); 
   sum = two / one ;
   System.out.println ( second +"/"+ first +"="+ sum ); 
   sum = one % two ;
   System.out.println ( first +"%"+ second +"="+ sum ); 
   sum = two % one ;
   System.out.println ( second +"%"+ first +"="+ sum );    
 }  // end main
}   // end class TwoNumbersMaths