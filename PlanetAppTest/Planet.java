public class Planet
{
    private int maxPopulation, maxSpaceMarinesPerStarDestroyer,nPlanets;
    private double percentSpaceMarines;
    private String p;
    private double radius;
    String[] namer= new String[]{"beta" + "alpha" + "gama" + "Delta"};

    private String relationship;
     
    
    public Planet()
    {
      relation = new String []{ "Hostile" , "At War", "Neutra", "Frenidly", "Ally"};
    }
    
    
    public Planet()
    {
        maxPopulation=1;
        maxSpaceMarinesPerStarDestroyer=1;
        nPlanets=1;
        Radius= 1;
        PercentSpaceMarines=1;
        Relationship= relationship[((int)Math.random())*5];
        P = namer[((int)Math.random())*4] + String.format("%.2f", Math.random());
    }
    
    
    public String toString()
    {
        return String.format(
                "Name: "+ p + "\n" +
                "Relationship:" + relationship + "\n" +
                "Radius:" + String.format("%.2f",radius) + "\n" +
                "Population:" + String.format("%.2f", maxPopulation-((int)(Math.random())*maxPopulation)) + "\n" +
                "Space Marines as percent of Pop.:" + percentSpaceMarines + "\n" +
                "Space Marines:" + percentSpaceMarines*maxPopulation + "\n" +
                "Star Destroyers:" + "" + "\n" +
                "Space Marines per star destroyer:" + String.format("%.2f",maxSpaceMarinesPerStarDestroyer) + "\n");
        return result;
    }

     public Planet( int maxPopulation, double percentSpaceMarines, int maxSpaceMarinesPerStarDestroyer)
    {
        this.maxPopulation = maxPopulation;
        this.percentSpaceMarines = percentSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer = maxSpaceMarinesPerStarDestroyer;
    }

   
    
}