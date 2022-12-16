package Class17;
//Write a java class that will have a constructor: one with parameters and second without any parameters.
// Create a separate Test class where you will execute both of the constructors 1 by 1.
public class phone {
   private String name;
     private String color;
    private double storage;
    private double size;
    public phone(String newName, String  newColor, double newStorage, double newSize){


        name=newName;
      color = newColor;
      storage=newStorage;
      size= newSize;

    }  public phone(){

    } void printInfo(){
        System.out.println(" name is "+ name+ " and color is "+ color+ " ,size"+size+" storage is "+ storage);

    }

}
