package Class22;

public class Car {
    void start(){
        System.out.println(" use the key to start the car");
    }
    void stop(){
        System.out.println(" use brakes to stop me");
    }
    void park(){
        System.out.println(" Park me manually");
    }}

  class BMW extends Car{
      void start(){
          System.out.println(" use push start to start me ");}
      void stop(){
          super.stop();// we can also use methods from parents
          System.out.println(" you can also  use auto breaking  to stop me");
      }
  }
  class  Toyota extends Car{
    void start(){
        System.out.println("push me to start");
    }}
  class Tesla extends Car{
     void start(){
         System.out.println(" Use the App to start me");
     }
     void stop(){
         System.out.println(" use AI and autoBreaking to stop me");
     } void park(){
          System.out.println(" I can auto selp my self");
      }
  }

