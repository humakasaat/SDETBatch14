public class HW_Student {
    //Write a Student class   that have instance variables name and address. Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    String name;
    String lastName;
    String address;
    public HW_Student( String name, String lastName, String address){
         this.name=name;
         this .lastName=lastName;
         this.address=address;

    } void displayInfo(){
        System.out.println("name is "+ name+ " and last name is "+ lastName+ " address"+address);
    }

    public static void main(String[] args) {
       new HW_Student("Fayez","Kasaat","123 spring road").displayInfo();

    }

}