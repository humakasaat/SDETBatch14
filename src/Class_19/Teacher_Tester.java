package Class_19;

public class Teacher_Tester {
    public static void main(String[] args) {
        MathTeacher a=new MathTeacher( "Ahmed", " Math", 234," Math");
       a.printInfo();
       ChemistryTeacher b= new ChemistryTeacher("Javed", "Chemistry",245,
               "Chemistry");
       b.printInfo();
       PianoTeacher c= new PianoTeacher(" Ali", " Piano ", 456," Music","Grand");
       c.printInfo();
    }
}
