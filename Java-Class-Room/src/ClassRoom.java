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

     //Add all constructors

    ClassRoom()
    {
        //initialize variables
    }

    ClassRoom(Teacher teacher,int numberOfStudents)
    {
        this.teacher= new Teacher(teacher.getName(), teacher.getSurname());
        this.students=new Student[numberOfStudents];

    }

    ClassRoom(Teacher teacher,Student[] students)
    {
        //initialize variables
        //This function will copy all students from the given student array and store them within the classes own student array
        
    }

    //Add all getters and setters for local variables 

    //Add all helper functions for the class

    void setStudents()
    {
        //This function will initialize 10 Student objects and store them in the students array
    }

    void setStudents(Student[] students)
    {
        //This function will copy all students from the given student array and store them within the classes own student array
    }

    void populateTop5()
    {
        //This function will take the top 5 students in the students array and store them into the top5 array
    }

    void populatePassed()
    {
        //This function will take all the students who passed in the students array and store them in the passed array
    }

    void populateFailed()
    {
        //This function will take all the students who failed in the students array and store them in the passed array
    }

    void calculateAverage()
    {
        //This function will calculate the average of the classroom eg. numberOfStudentsWhoPassed/totalNumberOfStudents
    }




}
