public class Planet
{
    private int maxPopulation, maxSpaceMarinesPerStarDestroyer,nPlanets;
    private double percentSpaceMarines;
    private String p;
    private double radius;
    String[] namer= new String[]{"Beta" + "Alpha" + "Gama" + "Delta"};

    private String relationship;
    
    public Planet()
    {
        maxPopulation=1;
        maxSpaceMarinesPerStarDestroyer=1;
        nplanets=1;
        radius= 1.00;
        percentSpaceMarines=1.0;
        relationship= relationshiper[((int)Math.random())*5];
        p = namer[((int)Math.random())*4] + String.format("%.2f", Math.random());
    }
    
    
    public String toString()
    {
        String result = String.format( 
                "Name: "+ p + "\n" +
                "Relationship:" + relationship + "\n" +
                "Radius:" + String.format("%.2f",radius) + "\n" +
                "Population:" + String.format("%.2f", maxPopulation-((int)(Math.random())*maxPopulation)) + "\n" +
                "Space Marines as percent of Pop.:" + percentSpaceMarines + "\n" +
                "Space Maries:" + percentSpaceMarines*maxPopulation + "\n" +
                "Star Destoyers:" + "" + "\n" +
                "Space Marines per star destroyer:" + String.format("%.2f",maxSpaceMarinesPerStarDestroyer) + "\n");
        return result;
    }

     public Planet( int maxPopulation, double percentSpaceMarines, int maxSpaceMarinesPerStarDestroyer)
    {
        this.maxPopulation = maxPopulation;
        this.percentSpaceMarines = percentSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer = maxSpaceMarinesPerStarDestroyer;
    }



    public Planet
    {
      relation = new String []{ "hostile" , "at war", "neutral", "friendly", "ally"};
    }
    
    
    
}