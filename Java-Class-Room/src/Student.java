
import java.util.Random;
public class Student extends Person {
    //Add all student variables with private access modifiers
    private String studentNumber;
    
    private double highestGrade;

    private String highestSubject;

    private double lowestGrade;

    private String lowestSubject;

    private Subject[] subjects;

    private boolean passed;
    
    //Add all constructors

    public Student(String name,String surname, String studentNumber,
                String highestSubject, double highestGrade, 
                    double lowestGrade, String lowestSubject, Subject[] subjects, 
                        boolean passed)
    {
        super(name, surname);
      //  this.name = name;
      //  this.surname = surname;
        this.studentNumber = studentNumber;
        this.highestGrade = highestGrade;
        this.highestSubject = highestSubject;
        this.lowestGrade = lowestGrade;
        this.lowestSubject = lowestSubject;
        this.subjects = subjects;
        this.passed = passed;





    }
    //Add all getters and setters for local variables 

    //Student Number

    public String getstudentNumber(){
        return studentNumber;
    }
    //highest grade

    public double gethighestGrade(){
        return highestGrade;
    }
    //highest subject

    public String gethighestSubject(){
        return highestSubject;
    }
    //lowest Grade

    public double getlowestGrade(){
        return lowestGrade;
    }
    //lowest Subject

    public String getlowestSubject(){
        return lowestSubject;
    }
    // subject
    public Subject subjects(){
        return subjects();
    }
    //Add all helper functions for the class

    //random student number generator 
    
    public void generateStudentNumber(String studentNumbeString) {}
        public static void main(String[] args) {
        	Random objGenerator = new Random();
            for (int iCount = 0; iCount< 10; iCount++){
              int randomNumber = objGenerator.nextInt(99999999);
              System.out.println("Student Number : student - " + randomNumber); 
            }
        
    }

            
    void printReportCard()
    {
        // print out to the terminal the report card of the student
        /* eg.
         * ------------------------------------------------------------------------------------------------
         *                                 Report Card For Njabulo Skosana
         *  Student Number : student-18089102
         *  English : 50%
         *  Maths : 40%
         *  Life science : 90%
         *  Physical Science : 95%
         *  Highest Subject : Physical Science Grade: 95%
         *  Lowest Subject : Maths Grade: 40%
         *  Passed : Yes
         */
    }
}
