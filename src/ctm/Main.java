package ctm;

public class Main {
    public static void main (String args[]){
        Student s1 = new Student();
        Student s2 = new Student(1,"Rohit",75);
        Student s3 = new Student(s2);

        s1.displayinfo();
        System.out.println("School Name - "+Student.displayScholName());
        s2.displayinfo();
        s3.displayinfo();

        s2.updateStudentDetails(78);
        s2.updateStudentDetails(82, "Rohit Khimavat");
        s2.displayinfo();

        GraduateStudent gs = new GraduateStudent(2,"Ravina",89);
        gs.displayinfo();
    }
}
