package Class22;

public class Animal {
    void eat(){
        System.out.println(" Animals usually eat plants");
    } void sleep(){
        System.out.println( " Animals sleep for 8 to 10 hours");
    }

} class Panda extends Animal{
   @Override
     void eat( ){
         System.out.println(" Pandas eat Bamboos");
     } void sleep(){
        System.out.println( " Pandas sleep for 14 hours");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println( " Animals sleep for 8 to 10 hours");
    }   void eat(){
        System.out.println("  cat like to eat fish");
}}