package Review_5;

public abstract class Car {
    // Abstraction focus on what the objects does instead of how it does it.
    // something it is uncompleted
    interface Drivable{

      //interface can contain only unimplemented methods and final variables
        //we can not have instance variable in interface, so no construction
        //by default all methods are public abstract
        void breaks();
      boolean DRIVES= true;
    }
    interface Vehicale{
     void haveMotor();

    }
    String color, make,model;
    public static final int WHEELS=4;
    public Car(String make, String model,String color){
        this.make=make;
        this.model=model;
        this.color=color;

    }
    void drive(){
        System.out.println("All cars can drive");
    }
    //
    abstract void start();
    abstract void stop();
   }

 class Tesla extends  Car implements Car.Drivable {

    Tesla(String make,String model,String color ) {
        super(make, model, color);
    }
    public void start(){
         System.out.println(make+"start automatically");
     }
      public void stop(){
         System.out.println( make+" Stops when press break");
     }
    public void charge(){
         System.out.println("You need to charge your tesla");
     }
     public void breaks(){

     }

        }



