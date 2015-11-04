public class SanelySane
{
    private int dian;
    private String name;
    private String heretic;
    public SanelySane()
        {
            dian = 9001 ;
            name = "BewBew";
             heretic = "*Any similarities to persons living or dead is completely coincidental. \n" +
                           "All calculations are extremely accurate. \n";
        }
    
    public SanelySane(int aLEvel, String name, String  heretic)
        {
            this.dian = dian;
            this.name = new String( name );
            this.heretic = new String(  heretic );
        }
    
    public String toString()
        {
            String output = String.format(heretic + "\n" + 
                                          "Name: " + name + "\n" + 
                                          "rektin level: " + dian);
            return output;
        }
        
    
}
