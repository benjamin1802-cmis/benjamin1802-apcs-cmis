 

public class University 
{
  public static void main( String[] args )
    {
      String school1 = new String( "California" );
      String school2 = new String( "Simpson" );
      String school3 = new String( "Colorado" );
      
      System.out.println(school1.compareTo(school2) );
      System.out.println(school1.compareTo(school3) );
      System.out.println(school2.compareTo(school3) );
      System.out.println(school2.compareTo(school1) );
      System.out.println(school3.compareTo(school1) );
      System.out.println(school3.compareTo(school2) );
    }// University Test
    
  // a. The output compareTo() method is comparing the first letter of the string.
  // b. C = 3 , S = 19
  // c. 3-19 = -16
  
  // b. When both letters are the same, method compares to the second letter
  // c. A = 1 , O = 15  ---- 0-15 = -15
 
  

}

