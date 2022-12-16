package Class27;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Dog> dogs= new ArrayList<>();
        dogs.add(new Dog("Tommy","Black","German"));
        dogs.add(new Dog("Jony","white","BullDog"));
        dogs.add(new Dog("Kimi","Brown","German"));
        //
         Dog dog=new Dog("Tommy","Black","German");
        System.out.println(dogs);

    }
}
