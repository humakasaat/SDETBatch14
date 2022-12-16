package Class_19;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    // Test all 4 classes
    String name;
    String  subject;
    int id;
    String department;
    public Teacher ( String name, String subject, int id, String department){
        this .name= name;
        this.subject=subject;
        this.id=id;
        this.department=department;}
    public void printInfo( ) {
        System.out.println(" name is " + name + " subject is" + subject + " id is " + id + " department" + department);
    }}
 class MathTeacher extends Teacher{
      public MathTeacher( String name, String subject, int id, String department){
          super( name, subject, id, department);

          }   void teachTheClass(){
         System.out.println(" I will teach the class even the world is ending");
     }
      }
  class ChemistryTeacher extends Teacher{

      public ChemistryTeacher( String name, String subject, int id, String department) {
        super( name, subject, id, department);


          }void teachChem(){
          System.out.println( " teaching chemistry");
    }}
class PianoTeacher extends Teacher{
    String pianoType;
   public PianoTeacher ( String name, String subject, int id, String department,String pianoType){
       super( name, subject, id, department);
       this.pianoType= pianoType;

   }
}

















