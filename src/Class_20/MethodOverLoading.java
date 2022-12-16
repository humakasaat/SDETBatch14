package Class_20;

public class MethodOverLoading {  //multiple methods with same name

    int number;
    double dNumber;
    MethodOverLoading(){

    }
    MethodOverLoading( double dNumber){
        this.dNumber=dNumber;
    }
    MethodOverLoading( int number){
        this.number=number;
    }

  static void add( int num1, int num2){
    System.out.println(num1+num2);
}
  static void add( double num1,double num2){
        System.out.println( num1+num2);
    }
    static  void add( double num1,double num2,double num3){

    }

    public static void main(String[] args) {
        add(10.3,3.4);
        System.out.println();
      new  MethodOverLoading(45 );
    }
}
