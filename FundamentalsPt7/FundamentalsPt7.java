public class FundamentalsPt7 
{
    public static void main ( String args[] )
    {
        int[]num = new int[10];
        int neg = 0;
        int pos = 0;
        for ( int a = 0; a < num.length ; a++)
        {
            int b = 0;

            b= (int)(100*Math.random());
            if (b % 2 ==0)
            {
                num[a] =((int)(100*(-1)*Math.random()));
                neg++;
            } //end if
            else 
            {
                num[a] =((int)(100*Math.random()));

                pos++;

            }// end else

        } // end for

        int b = 0;
        while (b < num.length)
        {
            System.out.println(num[b]);
            b++;
        }// end while
        System.out.println("The number of positive integers are " + pos + ". The number of negative integers are " + neg + ".");
        for ( int index = 0; b < num.length; b++)
        {

            if ( num [ b ] > 0)
            {
                System.out.print(num[b] + "\t");

            }
        }

    }   // end main
} // end FundamentalsPt7 