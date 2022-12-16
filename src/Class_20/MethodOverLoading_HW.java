package Class_20;

public class MethodOverLoading_HW {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
      static void numbers( int num1){
        System.out.println( " Java is hard");

    } static  void numbers( int num1, int num2){
        System.out.println( " Java is fun");

    } static void numbers( int num1, int num2, int num3){
        System.out.println( " Java is crazy ");

    }

    public static void main(String[] args) {
        MethodOverLoading_HW.numbers(3);
        MethodOverLoading_HW.numbers(3,4);
        MethodOverLoading_HW.numbers(1,2,3);
    }
}
