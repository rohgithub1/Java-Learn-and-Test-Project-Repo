package ctm;

public class Student{
    public String name;
    public int id;
    public int marks;
    private static String schoolname;

    //default constructor
    public Student(){
        this.id = 0;
        this.name = "unknown";
        this.marks = 0;
    }

    //parameterized constructor
    public Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //copy constructor
    public Student(Student copyStudent){
        this.id = copyStudent.id;
        this.name = copyStudent.name;
        this.marks = copyStudent.marks;
    }

    //instance method
    public void displayinfo(){
        System.out.println("From Student\nRoll No :"+this.id+"\nName :"+this.name+"\nTotal marks :"+this.marks);
    }

    //static method
    public static String displayScholName(){
        return "Muktangan";
    }

    //overload methods with one or two parameters.
    public int updateStudentDetails(int marks){
        this.marks = marks;
        return marks;
    }

    public String updateStudentDetails(int marks, String name){
        this.marks = marks;
        this.name = name;
        return marks +" "+ name;
    }
}

class GraduateStudent extends Student{

    public GraduateStudent(int id, String name, int marks){
        super(id, name, marks);
    }
    //override displayinfo method
    @Override
    public void displayinfo(){
        System.out.println("From GraduateStudent\nRoll No :"+id+"\nName :"+name+"\nTotal marks :"+marks);
    }
}
