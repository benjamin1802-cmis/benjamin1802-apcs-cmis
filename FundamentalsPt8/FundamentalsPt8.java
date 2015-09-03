public class FundamentalsPt8
{
     public static void main ( String args[] )
     {
          String [] artists = {"Exo", "Apink", "2ne1"};
          
          for(int a = 0;a<artists.length;a++)
          {
                System.out.println(artists[a] );
            }
            
            artists[((int)(3*Math.random()))] = "Michael Jackson";
            for(int a = 0;a<artists.length;a++)
            {
                System.out.println(artists[a]);
            }
            
            for(int a = 0;a<artists.length;a++)
            
           {
                if ( artists[a].equals("Michael Jackson"))
                {
                    System.out.println("We found Michael!");
                    
                }
           else
                {
                    System.out.println("No Michael in music" + "["+a+"]");
                }
                
            }//end for
        }// end main    
    }// end class FundamentalsPt8
        
         
    

                