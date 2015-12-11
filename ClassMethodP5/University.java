 

public class University 
{
  public static void main( String[] args )
    {
      String school1 = new String( "University of Colorado Denver" );
      String school2 = new String( "Simpson University" );
      String school3 = new String( "Biola University" );
      
      System.out.println(school1.compareTo(school2) );
      System.out.println(school1.compareTo(school3) );
      System.out.println(school2.compareTo(school3) );
      System.out.println(school2.compareTo(school1) );
      System.out.println(school3.compareTo(school1) );
      System.out.println(school3.compareTo(school2) );
    }// University Test
    
  // a. The method gives us a "2".What it means is that that the beginning letter of UC Irvine which is 
  //    "U" comes 18 letters after the beginning letter of California State Long beach being "C".
  
  // b. When the first letter is the same and the second letter is different, the method then compares the second
  //    letters. For instance, if I have AC college and AC Redding University, the first two letters are the same so it goes straight to the third letter. 
 
  

}