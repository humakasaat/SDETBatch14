package Class_20;

public class Programing {
    //Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message
    // "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages"
    // the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
    void  ProgramingL_1(){
        System.out.println(" I love programming languages");
    } void Programing_1( String str){
        System.out.println("I love java" +str);
    }

    }  class ProgramingTester{
    public static void main(String[] args) {
        Programing obj= new Programing();
       obj.Programing_1(" Programing");
        obj.ProgramingL_1();

    }
}

