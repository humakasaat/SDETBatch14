package Review_3;

public class School {
    public static void main(String[] args) {
        Teacher teacher= new Teacher(" John", " Smith");
        System.out.println(teacher.name);
        Teacher t1= new Teacher(" huma", " kasaat"," Biology");
        t1.teach();
        Teacher t2= new Teacher(" ali", " ahmad",4);
        Teacher.school=" Syntax";
        Teacher.work();
        System.out.println(t1.name);
}}
