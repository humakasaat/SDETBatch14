package Class16;

public class Student {
    String name;
    String id;

    static int numberOfStudent;
    public static void main(String[] args) {
        Student roman= new Student();
        roman.id="1";
        numberOfStudent++;
        Student SonamKapor= new Student();
        SonamKapor.id="2";
        numberOfStudent++;
        System.out.println(Student.numberOfStudent);
    }
}
