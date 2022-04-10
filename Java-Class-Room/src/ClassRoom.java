public class ClassRoom {

    /* Do not remove the comments

    // 1. create a Teacher object reference with a public access modifier eg. private Teacher teacher;

    // 2. create a Student array reference with a privae access mdoifier eg. private Student[] students;

    // 3. create a Student array reference with a private access modifier to store the top ten Students based on their averages eg. private Student[] topTen;

    // 4. create a Student array reference with a private access modifier to store the Students with an avarage of 50% and above eg. private Student[] passed;

    // 5. create a Student array reference with a private access modifier to store the Students with an avarage of 49% and above eg. private Student[] failed;

    // 6. create a double reference with a private access modifier to store the average grade of all  eg. private double average;

    // 7. create a interger reference with a private access modifier to store the number of students in the classroom eg. private int numberOfStudents;

    // 8. create functions with a public access modifier to get and set all private variable eg  public int getNumberStudents(){};

    // 9. create a deep copy function with a public modifier to copy all student objects in array to local students array inside the ClassRoom Class;

    // 10. create a shallow copy function with a public modifier to copy a reference to an external array to the local students array inside the ClassRoom Class;

    // 11. create a printReportCards function with a public modifier to print out all report cards of students in the students array; 

    // 12. Add a default constructor to initialize all local variables;

    // 13. Add a copy constructor to initialize all local variables but create a deep copy for students;

    // 14. Add getters and setters with public access modifier for all local variables;

    // 15. Add a function called populateTopTen with public access modifier to add the top ten students from the students array;

    // 16. Add a function called populatePassed with public access modifier to add the students who passed from the students array;

    // 17. Add a function called populateFailed with public access modifier to add the students who failed from the students array;

     // 18. Add a function called calculateAverage with public access modifier to calculate the classrooms pass average based on how many students passed from the students array;
    -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    Add code below
    */
    //Add all student variables with private access modifiers
    private Teacher teacher;
    
    private Student[] students;

    private Student[] topFive;

    private Student[] passed;

    private Student[] failed;

    private double average;

    private int numberOfStudents;

// teacher object
    Teacher myteacher = new Teacher("Njabulo", "Skosana");
// create a deep copy function with a public modifier to copy all student objects in array to local students array inside the ClassRoom Class;
    

     //Add all constructors
    ClassRoom(Teacher teacher, int numberOfStudents)
    {
        this.teacher = new Teacher(teacher.getName(), teacher.getSurname());
        this.students = new Student[numberOfStudents];
    }
     ClassRoom(Teacher teacher, Student[] students){}
     ClassRoom(Student[] students, double average, int numberOfStudents){
        
     }

    //Add all getters and setters for local variables 

    //getters
    public int getnumberOfStudents(){
        return numberOfStudents;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public Student[] getStudents(){
        return students;
    }
    public Student[] getTopFive(){
        return topFive;
    }
    public Student[] getPassed(){
        return passed;
    }
    public Student[] getFailed(){
        return failed;
    }
    public double getAverage(){
        return average;
    }
    //setters
    public void setNumberOfStudents(int numberOfStudents, Student[] students){
    this.students = students;
    this.numberOfStudents = numberOfStudents;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public void setStudents(Student[] students){
        this.students = students;
    }
    public void setTopFive(Student[] topfive){
        this.topFive = topFive;
    }
    public void setPassed(Student[] passed){
        this.passed = passed;
    }
    public void setFailed(Student[] failed){
        this.failed = failed;
    }
    void setAverage(double average){
        this.average = average;
    } 

    //Add all helper functions for the class
    void setSubjects(Student[]students)
    {

    }
    void populateTop5(){}
    void setpopulatePassed()
    {
        passed = new Student [10];
        int index = 0;      
        for(int i=0; i<students.length;i++)
        {
            if(students[i].getFailed()==true)
            {
                passed[index] = students[i];
                index++; 
            }
            
        }

    }
    public void setpopulateFailed()
    {
        //those who have failed
        failed = new Student [10];
        int index = 0;      
        for(int i=0; i<students.length;i++)
        {
            if(students[i].getFailed()==false)
            {
                failed[index] = students[i];
                index++; 
            }
            
        }

    }
     void setCalculateAverage()
    {      
        //getting array length
        int numberOfStudentsWhoPassed = 0;
        for(int i=0; i<students.length;i++)
        {
           if(students[i].getPassed()==true)
           {
            numberOfStudentsWhoPassed++;
           }
        }
        double avg = numberOfStudentsWhoPassed/10;
        double percentage = avg * 100;
        this.average = percentage;
    
        
    }   




}
