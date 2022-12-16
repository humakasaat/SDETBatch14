package Class28.Notes;

import java.util.HashMap;

public class MapsDemoWithLambda {
    public static void main(String[] args) {
        HashMap<String, Double> items= new HashMap<>();
        items.put("Iphone",1000.0);
        items.put("Eggs",20.4);
        items.put("Apples",5.0);
        items.put("Keyboards",100.0);
        items.keySet().removeIf(name->name.contains("e"));
        System.out.println(items);
    }
}
