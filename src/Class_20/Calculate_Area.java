package Class_20;

public class Calculate_Area {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
      void areaOfRectangle  ( int num1, int num2){
          System.out.println(" the area of rectangle is " +( num1*num2));
      } void areaOfSquare( int num1){
        System.out.println( " the area of square is "+( num1*num1));
    } void  calculateVolume( int l, int w, int h ){
        System.out.println(" the area of box is "+( l*w*h));
    }
}  class Calculate{
    public static void main(String[] args) {
         Calculate_Area obj= new Calculate_Area();
         obj.areaOfRectangle(4,5);
         obj.areaOfSquare(4);
         obj. calculateVolume( 4,6,9);

}}
