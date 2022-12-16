package Review_3;

public class Teacher {
    String name,lname;
    String subject;
    int experience;
    double salary;
    static  String school;
    Teacher( String name, String lname){
        // this. to refer to the current object : instance variable : instance methods
        // this()- refer to the current object: curent class constructor
     this. name=  name;
     this.lname=lname;
    }
    Teacher( String name, String lname, String subject){
        this( name,lname);
        this.subject=subject;
    }
    Teacher( String name, String lname, int experience){
        this( name, lname);
        this.experience=experience;

    } static void work(){
        System.out.println( "Al teachers work at "+ school);
    } void print(){
        System.out.println(" Teacher name is"+ name);
    } void teach(){
        System.out.println( name+"  teaches"+ subject);
    }
}