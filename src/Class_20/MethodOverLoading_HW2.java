package Class_20;

public class MethodOverLoading_HW2 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private void method( String str ){
        System.out.println( " today is Sunday");
    } private  void method( String str, int num1){
        System.out.println( " today is October "+ num1 );

    } private  void method( int num1, String str){
        System.out.println( num1+" is an odd number");

    }

    public static void main(String[] args) {
        new MethodOverLoading_HW2().method(" Sunday");
        new MethodOverLoading_HW2().method(" October", 13);
        new MethodOverLoading_HW2().method( 3, " odd") ;
    }
}
