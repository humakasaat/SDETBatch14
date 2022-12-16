package Class17;

public class Teacher {
    String name, lastName;     // instance variable
    int experience;
    String subject;
     double salary;
     static String school;
     // how to create a constructor
    //1, constructor name = class name
    // not return type not even void
    // using below constructor  we initilize instance variable
    Teacher( String fName, String lName){
         name=fName;    // local variable
         lastName =lName;

    }  void printInfo(){
        System.out.println("name "+ name+" last name "+ lastName);
    }
    //when we create a constructor, there is no default constructor



}
