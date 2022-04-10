public class Main {
    public static void main(String[] args) throws Exception {
      
        Teacher myTeacher = new Teacher("Njabulo", "Skosana");
        ClassRoom myClassRoom = new ClassRoom(myTeacher,10);
        Student[] myStudents = new Student[10];
        
        myStudents[0] = new Student("Dai","Jean");
        myStudents[0].setSubjects();
        myStudents[0].setPassed();
       

        Subject[] mySubjects = myStudents[0].getSubjects();
        for(int i=0; i<mySubjects.length; i++)  
        {
            System.out.println(mySubjects[i].getSubjectName()+ " : "+ mySubjects[i].getMark()+ " %");
        }
        myStudents[0].setHighestGradeAndSubject();
        System.out.println("Highest Subject : " + myStudents[0].getHighestSubject()+" Grade : " + myStudents[0].getHighestGrade() + "%");
        
        myStudents[0].setLowestGradeAndSubject();
        System.out.println("Lowest Subject : " + myStudents[0].getLowestSubject()+" Grade : " + myStudents[0].getLowestGrade() + "%" );
        
        
        myStudents[1] = new Student("Karen","Stuart");
        myStudents[2] = new Student("Nawal","Foreman");
        myStudents[3] = new Student("Bathanie","Ahmad");
        myStudents[4] = new Student("Darien","Mcguire");
        myStudents[5] = new Student("Mallory","Fuller");
        myStudents[6] = new Student("Nina","Gamble");
        myStudents[7] = new Student("Harry","Benitez");
        myStudents[8] = new Student("Paula","Wyatt");
        myStudents[9] = new Student("Diane","Murphy");
        myClassRoom.setStudents(myStudents);

        System.out.println("Passed : " + myStudents[0].getPassed());

        myClassRoom.setCalculateAverage();
        for(int i = 0; i <myStudents.length; i++)  
        {
            System.out.println("Class Average"+ myClassRoom.getAverage());
        }

        
        
               
        
    }      
}