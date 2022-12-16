package Class14;

public class HomeWork2 {
    //Create a method that will take a number and prints whether the number is even or odd.
    void evenNum( int num1){
        if( num1%2==0){
            System.out.println(num1+" is even");
        } else{
            System.out.println(num1+" is odd ");
        }
    }

    public static void main(String[] args) {
        HomeWork2 a= new HomeWork2();
        a.evenNum(4);
        a.evenNum(3);
    }
}
