package Class19;

public class Furniture {
    String color= " green";
}
class Chair extends Furniture{
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println( super.color);
    }
} class TestChair {
    public static void main(String[] args) {
        Chair chair= new Chair();
        chair.printColor();
    }
}
