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

    Student(String name,String surname)
    {
        super(name, surname);
    }
    //Add all getters and setters for local variables 

    //Add all helper functions for the class
    void generateStudentNumber()
    {
        // Generate a unique student number a each student
        // The student number must start with the word student
        // then separated by a hyphen a random 8 digit number
        // eg student-18089102
        // then store the string in the local student number variable
    }

    void setSubjects()
    {
        // Generate an array of subjects where each student has 4 Subjects
        // Subjects : Maths, LifeScience, Physical Science and English
        // generate a random 2 digit number for each Subject and store it as the students mark for that Subject
        // if the mark>=50 then set the Subject passed variable as true 
        // if the mark<=49 then set the Subject passed variable as false
        // then store the Subject inside the subjects array 
    }

    void setHighestGradeAndSubject()
    {
        //Loop through the subjects array and find the highest subject with the highest grade then update the highestSubject and highestGrade variables
    }

    void setLowestGradeAndSubject()
    {
        //Loop through the subjects array and find the lowest subject with the lowest grade then update the lowestSubject and lowestGrade variables
    }

    void setPassed()
    {
        //Loop through the subjects array and if the student has passed 3 or more subjects set the passed variable to true
        // if the student has not passed 3 or more subjects then set the passed variable to false
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
