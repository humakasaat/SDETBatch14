package Review_5;

public class CarTest {
    public static void main(String[] args) {
     Car car=   new Tesla("Tesla","X","yellow");
      car.start();
      car.stop();
      car.drive();
        Tesla tesla= new Tesla("Tesla", "X","Green");
        tesla.start();
        tesla.drive();
        tesla.charge();
        tesla.stop();

    }
}
