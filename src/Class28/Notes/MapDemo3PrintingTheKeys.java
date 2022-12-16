package Class28.Notes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3PrintingTheKeys {
    public static void main(String[] args) {
        HashMap<String, Double> items= new HashMap<>();
        items.put("Iphone",1000.0);
        items.put("Eggs",20.4);
        items.put("Apples",5.0);
        items.put("Keyboards",100.0);
      Set<String> keySet =items.keySet();
        for (String key: keySet
             ) {
            System.out.println(key);
        }

      // write the code to print the values from a map using a loop
        Collection<Double> values= items.values();
        for (double value: values
             ) {
            System.out.println(value);
        }

    }
}
