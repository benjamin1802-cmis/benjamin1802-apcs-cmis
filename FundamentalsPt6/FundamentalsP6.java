public class FundamentalsP6 
    {
  public static void main ( String args[] )
  {
    
    int[] array = new int[50];
    
    for( int index = 0; index < array.length; index++ )
    
    {
        
     array[index] =((int)(100*Math.random()));
     
    }//end for loop
    
    for( int index = 0; index < array.length; index++ )
    
    {
        
     System.out.println(array[index]);
     
    }//end for loop    
      } // end main
} // end FundamentalsP6 