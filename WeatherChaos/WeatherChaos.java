    import javax.swing.JOptionPane;

   
    public class WeatherChaos

{
    public static void main (String [] args);

       
    {
        String user = JOptionPane.showInputDialog( "Type in a number");
            
            if (user>31 && user <31)
        {
                             System.out.println("That's not a valid number of days!");
                            }
             else
            
             {    
                            System.out.println("day  temp  swing  description");

        }
             
            int [] tempt = new int [user];
            int day;
            int swing=0;
            int maximum = 0;
            int minimum = 99;
            int maxDay = 0;
            int minDay = 0;
            int maxswing = 0;
            int maxswingofdays =0;
            int totalamt = 0;
            
            
   for (int index = 0; index < tempt.length; i++)
                {
                temps[ index ] = (int) (Math.random() * 200) - 100;
                day = a + 1;
                if (a > 0)
                    {
                    swing = temps[a] - temps[a - 1];
                    }//end if
                
                    else
                    {
                    swing = 0;
                    }//end else
                
                   if (temps[index] < 0)
                    {
                    System.out.println = ( "frezing" );
                    }//end if
                
                    
                    else if (temps[index] > 0 && temps[index] <= 15)
                    {
                    System.out.println = "Chilly";
                    }//end else if
               
                    else if (temps[index] > 15 && temps[index] <=30)
                    {
                    System.out.println = ( "comfortable" );
                    }//end else if
              
                    else if (temps[index] > 30 && temps[index] <= 40)
                    {
                    System.out.println = ( "hot" );
                     }//end else if
               
                    else
                    {
                    description = "agh!h112314@!$!@$!$!@#";
                    }//end else
                    
                    if (tempt [index] >= max)
                {
                    max = tempt [ index]; 
                    maxDay= index;
                }
                if (tempt [index] <= min)
                {
                    min = tempt [ index];
                    minDay = index;
                }
                if (swings >= maxswing)
                {
                    maxswing = swings;
                    swing= index;

                    }
        
            }
         System.out.println("The minimum temperature was: " + min + " on the day" +minDay +".");
        System.out.println("The maximum temperature was: " + max + "on the day" +maxDay+ ".");
        System.out.println( "The average temperature was: " +  (double)sum/tempts.length +".");
        System.out.println("The biggest temperature swing was: " + maxswing + " temp ");
        }
 
        
         
       
              
          
       
         
  
}// end main
    }// end class
               

    
  
 
                
                    
              
       

    
    
    
    
     