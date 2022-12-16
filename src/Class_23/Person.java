package Class_23;

public interface Person {
    void eat();

}
 interface Employee{
    void work();
 }
 interface  SyntaxEmployee extends Employee, Person{

 }
 class Asgher implements SyntaxEmployee{

     @Override
     public void eat() {

     }

     @Override
     public void work() {

     }
 }