package Class18Review;

public class DogTester {
    public static void main(String[] args) {
        Dog.breed=" Huskey";
        Dog dog1= new Dog();
        dog1.name=" Bobby";
        dog1.weight=5;
        dog1.printInfo();
        Dog dog2= new Dog();
        dog2.name=" Tommy";
        dog2.weight=10;
        dog2.printInfo();
        double price=dog1.getPrice();
        System.out.println(price);

        float price2=dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());
       dog1.love( "to jump");

    }

}
