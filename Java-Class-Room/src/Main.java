public class Main {
    public static void main(String[] args) throws Exception {
        //test if all your classes are working as intended
        Teacher teacher= new Teacher("Njabulo", "Skosana");
        System.out.println(teacher.getName());
    }
   // public void main(String[] args) {
      //      String array[] = {this.subjects};

    Teacher myTeacher = new Teacher("Njabulo", "Skosana");
    ClassRoom myClassRoom = new ClassRoom(myTeacher,10);
    Students[] myStudents = new Student[10];
    myStudents[0] = new Student ("Dai","Jean");
            
    }
}