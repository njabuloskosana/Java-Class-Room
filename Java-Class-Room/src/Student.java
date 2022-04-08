
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
    Student (String name, String surname)
    {
        super(name, surname);
      //  this.name = name;
      //  this.surname = surname;
    }
    public Student(String name,String surname, String studentNumber,
                String highestSubject, double highestGrade, 
                    double lowestGrade, String lowestSubject, Subject[] subjects, 
                        boolean passed)
    {
        super(name, surname);
        
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

    public String getStudentNumber(){
        return studentNumber;
    }
    //highest grade

    public double getHighestGrade(){
        return highestGrade;
    }
    //highest subject

    public String getHighestSubject(){
        return highestSubject;
    }
    //lowest Grade

    public double getLowestGrade(){
        return lowestGrade;
    }
    //lowest Subject

    public String getLowestSubject(){
        return lowestSubject;
    }
    // subject
    public Subject[] getSubjects(){
       return subjects;
    }
    //Add all helper functions for the class

        //random student number generator 

    public void generateStudentNumber(){
                String generatestudentNumber = "student - ";
              	Random rnd = new Random();
                int studentNumber = rnd.nextInt(99999999);
                String num = String.format("%08d", studentNumber);
                this.studentNumber = generatestudentNumber + num;
    }
        //assigning 4 subjects to an array.
    public void setSubjects(){
        subjects = new Subject[4];
        String subjectName1 = "Maths";
        String subjectName2 = "LifeScience";
        String subjectName3 = "Physical Science";
        String subjectName4 = "English";

        //subject random number generator.
        Random rnd = new Random();
        double mark1 = rnd.nextInt(99);
        double mark2 = rnd.nextInt(99);
        double mark3 = rnd.nextInt(99);
        double mark4 = rnd.nextInt(99);

        //check if student has passed.
        boolean hasPassed1 = false;
        boolean hasPassed2 = false;
        boolean hasPassed3 = false;
        boolean hasPassed4 = false;


        if(mark1 >= 50)
        {
            hasPassed1 = true;
        }
        else if (mark1 <=49)
        {
            hasPassed1 = false;
        }

        if(mark1 >= 50)
        {
            hasPassed2 = true;
        }
        else if (mark2 <=49)
        {
            hasPassed2 = false;
        }

        if(mark1 >= 50)
        {
            hasPassed3 = true;
        }
        else if (mark3 <=49)
        {
            hasPassed3 = false;
        }
        if(mark1 >= 50)
        {
            hasPassed4 = true;
        }
        else if (mark4 <=49)
        {
            hasPassed4 = false;
        }
        subjects[0] = new Subject(subjectName1, mark1, hasPassed1);
        subjects[1] = new Subject(subjectName2, mark2, hasPassed2);
        subjects[2] = new Subject(subjectName3, mark3, hasPassed3);
        subjects[3] = new Subject(subjectName4, mark4, hasPassed4);
    
    }
     
     
    public void setHighestGradeAndSubject(){
     double mark = 0;
     String subject = "";
     for(int i=0; i<subjects.length; i++)
     {
        if(mark<subjects[i].getMark())
        {
            mark=subjects[i].getMark();
            subject=subjects[i].getSubjectName();
        }
     }
     this.highestGrade = mark;
     this.highestSubject = subject;

    }
    
    void setLowestGradeAndSubject(){
        double mark = 0;
     String subject = "";
     for(int i=0; i>subjects.length; i++)
     {
        if(mark>subjects[i].getMark())
        {
            mark=subjects[i].getMark();
            subject=subjects[i].getSubjectName();
        }
     }
     this.lowestGrade = mark;
     this.lowestSubject = subject;
    }
    void setPassed(){
        //using array to print out if student passed 3 of the 4 subjects
        
        }


            
    void printReportCard()
    {
        // print out to the terminal the report card of the student
        /* eg.-+*

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
