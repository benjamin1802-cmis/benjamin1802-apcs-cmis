public class CardApp
{
    public static void main ( String[] args )
    {
       String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
       String [] suits = {"♠", "♣", "♦", "♥"};
       String rank = "";
       String suit = "";
       System.out.println("Your Hand");
       String card1 = "";
       String card2 = "";
       String card3 = "";
       for(int i = 0;i<3;i++)
       {
           int randomNum1 = (int) (Math.random() * 13);
           int randomNum2 = (int) (Math.random() * 4);
           rank = ranks[randomNum1];
           suit = suits[randomNum2];
           
           Card hand2 = new Card(rank, suit, card1,card2,card3);
           System.out.println( hand2 );
       }
       
       Card hand1 = new Card();
       System.out.println("Your Hand");
       System.out.println( hand1 );
    }
}



public class Card
{
    private String rank;
    private String suit;
    private String card1;
    private String card2;
    private String card3;
    public Card()
        {
            card1 = "K♦ \n";
            card2 = "10♥ \n";
            card3 = "A♥ ";
            rank = "";
            suit = "";
        }
        
    public Card(String rank, String suit, String card1, String card2, String card3)
        {
            this.rank = new String(rank);
            this.suit = new String( suit );
            this.card1 = new String(card1);
            this.card2 = new String( card2 );
            this.card3 = new String( card3 );
            
        }
    
    public String toString()
        {
           String output = String.format(rank+suit +
                                         card1 + card2 + card3);
           return output;
        } 
}