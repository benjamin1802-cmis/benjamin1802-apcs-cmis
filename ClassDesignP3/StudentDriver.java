import javax.swing.JOptionPane;
public class StudentDriver {
    public static void main (String argvs [] )
    {
        Student senior001 = new Student ();
        System.out.println ( "Senior001" +senior001);
        Student junior001 = new Student ("Naruto", "Uzamaki", 10, 2.70);
        System.out.println ( "Junior001" +junior001);
        JOptionPane.showMessageDialog(null, "Senior001"+ senior001 +"  Junior001" +junior001, "Junior001 and Senior001", JOptionPane.INFORMATION_MESSAGE ) ;
    }
} //end class StudentDriver
