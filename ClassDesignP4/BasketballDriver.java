public class BasketballDriver
{
    public static void main ( String[] args )
    {
        Basketball otherBasketball = new Basketball ();
        Basketball thisBasketball = new Basketball("LA Lakers", 5);
        System.out.println(otherBasketball);
        System.out.println(thisBasketball);
    }
}