public class CardDriver2
{
    public static void main ( String[] args )
    {
        String [] Dealer = new String[2];
        String [] P1 = new String [2];
        String [] P2 = new String [2];
        String [] P3 = new String [2];
        String [] P4 = new String [2];
        String [] P5 = new String [2];       
        String [] Cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String [] Suits = {"♠", "♥", "♦", "♣"};
        int value = 0;
        int totalvalue = 0;
        int totaldealer = 0;
        int[] x = new int[2];
        int[] y = new int[2];
        for ( int i = 0; i < Dealer.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            Dealer[i] = "Dealer's hands: " + Suits[i] + Cards[i];
            System.out.println(Dealer[i]);
            if (Cards[i] == "2")
            {
                value = 2;
            }
            if (Cards[i] == "3")
            {
                value = 3;
            }
            if (Cards[i] == "4")
            {
                value = 4;
            }
            if (Cards[i] == "5")
            {
                value = 5;
            }
            if (Cards[i] == "6")
            {
                value = 6;
            }
            if (Cards[i] == "7")
            {
                value = 7;
            }
            if (Cards[i] == "8")
            {
                value = 8;
            }
            if (Cards[i] == "9")
            {
                value = 9;
            }
            if (Cards[i] == "10")
            {
                value = 10;
            }
            if (Cards[i] == "J")
            {
                value = 10;
            }
            if (Cards[i] == "Q")
            {
                value = 10;
            }
            if (Cards[i] == "K")
            {
                value = 10;
            }
            if (Cards[i] == "A")
            {
                value = 11;
            }
            totaldealer += value;
        }
        System.out.println("Total card value of dealer: " + totaldealer);
        System.out.println("\n");

        for ( int i = 0; i < P1.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P1[i] = "Player 1's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P1[i]);
            if (P1[i] == "2")
            {
                value = 2;
            }
            if (P1[i] == "3")
            {
                value = 3;
            }
            if (P1[i] == "4")
            {
                value = 4;
            }
            if (P1[i] == "5");