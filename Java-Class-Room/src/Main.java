public class Main {
    public static void main(String[] args) throws Exception {
      
        Student[] myStudents = new Student[10];
        myStudents[0] = new Student("Dai","Jean");
        myStudents[0].setSubjects();
        Subject[] mySubjects = myStudents[0].getSubjects();
        for(int i=0; i<mySubjects.length; i++)  
        {
            System.out.println(mySubjects[i].getSubjectName()+ " : "+ mySubjects[i].getMark()+ " %");
        }
        myStudents[0].setHighestGradeAndSubject();
        System.out.println("Highest Subject : "+myStudents[0].getHighestSubject()+"Grade : " + myStudents[0].getHighestGrade() + "%");
        
        myStudents[0].setLowestGradeAndSubject();
        System.out.println("Lowest Subject : "+myStudents[0].getLowestSubject()+"Grade : " + myStudents[0].getLowestGrade() + "%" );
        
        System.out.println("Subject Passed "+ mySubjects[i].getPassed());
    }
}