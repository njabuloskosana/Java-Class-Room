import javax.security.auth.SubjectDomainCombiner;

public class Subject {
    /* Do not remove the comments
    // 1. create a string reference to the name of the subject with a private access modifier eg. private String subjectName;

    // 2. create a double reference to the mark the student recieved for the subject with a private access modifier eg. private double mark;

    // 3. create a boolean reference to show if the student passed the subject or not with a private access modifier eg. private boolean passed;
    
    // 4. Add a constructor to initialize all local variables;

    // 5. Add getters and setters with public access modifier for all local variables;
    -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    Add code below
    */

     //Add all student variables with private access modifiers
    private String subjectName;
    private double mark;
    private boolean passed;

    //Add all constructors
    Subject(String subjectName, double mark, boolean passed){
        this.subjectName = subjectName;
        this.mark = mark;
        this.passed = passed;
    }
    Subject(String subjectName, double mark){
        this.subjectName = subjectName;
        this.mark = mark;
    }

    //Add all getters and setters for local variables 
    public String getSubjectName(){
        return subjectName;
    }
    public double getMark(){
        return mark;
    }
    public boolean getPassed(){
        return passed;
    }
    public void setSubjectName(){
        this.subjectName = subjectName;
    }
    public void setMark(){
        this.mark = mark;
    }
    public void setPassed(boolean studentpassed){
        this.passed = studentpassed;
    }
     //Add all helper functions for the class
        void generateStudentNumber(){}
        void setSubjects(){}
        void setPassed(String subjectName, boolean passed){
            this.subjectName = subjectName;
            this.passed = passed;

        }
        

        
    
}
