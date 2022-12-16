package Class_24;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        // use add method to insert elements in arryist
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println("--------------------------------");
        System.out.println(colors);
        colors.remove("Blue"); // remove one by one
        System.out.println("---------------------------------");
        System.out.println(colors);
        System.out.println("------------------------------");
        colors.remove(2);
        System.out.println(colors);
    }
}
