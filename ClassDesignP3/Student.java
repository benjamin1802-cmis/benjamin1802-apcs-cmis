public class Student
{
    private int grade;
    private double gpa;
    private String firstName;
    private String lastName;
    private String Eden;
    public Student()
        {
            grade = 11;
            gpa = 3.5;
            firstName = "Ben";
            lastName = "Chit";
            Eden = "Derp \n" +
                              "Nerp \n" +
                              "Herpinonononononon";
        }
    
    public Student(int grade, double gpa, String firstName, String lastName, String dBallZReference)
        {
            this.grade = grade;
            this.gpa = gpa;
            this.firstName = new String( firstName);
            this.lastName = new String( lastName );
            this.Eden = new String( Eden );
        }
    
    public String toString()
        {
            String output = String.format("Student Info: " + "\n" +
                                          "Name: " + firstName + " " + lastName + "\n" +
                                          "Grade: " + grade + "\n" +
                                          "GPA: " + gpa + "\n" +
                                          Eden);
            return output;
        }
        
    
}