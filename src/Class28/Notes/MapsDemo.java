package Class28.Notes;

import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String, Double> items= new HashMap<>();
        items.put("Iphone",1000.0);
        items.put("Eggs",20.4);
        items.put("Apples",5.0);
        items.put("Keyboards",100.0);
// if we want to remove the items if their price is more than 10
           items.values().removeIf(price->price>10);

        System.out.println(items);

    }
}
