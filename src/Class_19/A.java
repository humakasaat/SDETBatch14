package Class_19;

public class A {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    String name;
    String familyName;
    String language;
    String nationality;
    public A(String name ,String familyName, String language, String nationality){
        this.name=name;
        this.familyName= familyName;
        this.language= language;
        this.nationality=nationality;
    } public void info() {
        System.out.println( "name is"+ name+ "and family name is" + familyName + " language is " + language + " .nationality" + nationality);
    } }
 class B extends A {
     public B(String name, String familyName, String language, String nationality) {
         super(name, familyName, language, nationality);}}

class C extends B{
    public C (String name ,String familyName, String language,String nationality){
        super( name,familyName, language, nationality);}}

   class Tester{
       public static void main(String[] args) {
        B obj= new B(" Huma ", " kasaat"," pashto"," Afghan");
        obj.info();

       }
   }



