    import javax.swing.JOptionPane;
    import.jacax.swing.Parseint;
   
    public class WeatherChaos

{
    public static void main ( String args[] );
       
    {
        String user = JOptionPane.showInputDialog( "Type in a number");
          
             {    
                System.out.println("days\temp\twing\description");
            }
                if (user > 0 && user <= 31)
       
        
            int [day];
            int swing;ja
            int max = 0;
            int maxDay = 0;
            int minDay = 0;
            int min = 99;
            int maxswing = 0;
            int maxswingofdays =0;
            int totalamt = 0;
            
            
   for (int a = 0; a < temps.length; i++)
                {
                temps[i] = (int) (Math.random() * 200) - 100;
                day = a + 1;
                if (a > 0)
                    {
                    swing = temps[a] - temps[a - 1];
                    }//end if
                
                    else
                    {
                    swing = 0;
                    }//end else
                
                   if (temps[a] < 0)
                    {
                    System.out.println = ( "frezing" )
                    }//end if
                
                    
                    else if (temps[a] > 0 && temps[a] <= 15)
                    {
                    System.out.println = "Chilly";
                    }//end else if
               
                    else if (temps[a] > 15 && temps[a] <=30)
                    {
                    System.out.println = ( "comfortable"; )
                    }//end else if
              
                    else if (temps[a] > 30 && temps[a] <= 40)
                    {
                    System.out.println = ( "hot";)
                     }//end else if
               
                    else
                    {
                    description = "agh!h112314@!$!@$!$!@#";
                    }//end else
        
        
                        
            System.out.println("The maximum temperature was " );
            System.out.println("The minimum temperature was " + );
            System.out.println("The average temperature was " + ();
            System.out.println("The biggest temperature swing was " );
        }//end if
        else
            {
            System.out.println("Not a valid number of days!");
            }//end else
        }//end method main
    }//end class WeatherChaos
                
                    
              
       

    
    
    
    
     