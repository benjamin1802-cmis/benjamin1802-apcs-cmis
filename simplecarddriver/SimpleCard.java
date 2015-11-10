public class SimpleCard

{
        public static void main (String[] args )
        

    private String suit = {"♠", "♣", "♦", "♥"};
    private String rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String deck1 = "";
    private String deck2 = "";
    private String deck3 = "";
    private String deck4 = "";
    private String deck5 = "";
 
    public SimpleCard(String suit, String rank)
    {
        this.suit = suit;
        this.rank = rank;
        this.card1 = new String(deck1);
        this.card2 = new String( deck2 );
        this.card3 = new String( deck3 );
    }

    public String toString()
    {
        return String.format("%s%s",rank, suit);
    }
}