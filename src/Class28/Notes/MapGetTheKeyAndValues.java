package Class28.Notes;

import java.util.HashMap;

public class MapGetTheKeyAndValues {
    public static void main(String[] args) {
        HashMap<String, Double> items= new HashMap<>();
        items.put("Iphone",1000.0);
        items.put("Eggs",20.4);
        items.put("Apples",5.0);
        items.put("Keyboards",100.0);
       // Set<Map .Entry<String,Double>>  entrySet =items.entrySet();
        var entrySet= items.entrySet();
        System.out.println(entrySet);
        for (var item:entrySet
             ) {
            System.out.println(item.getKey()+" "+item.getValue());
        }
        items.entrySet().removeIf(entry->entry.getKey().contains("e")&&entry.getValue()>10);
        System.out.println(items);


    }
}
