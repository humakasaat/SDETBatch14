package Class27;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit= new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);
        Set<String> keySet=fruit.keySet();
        System.out.println(keySet);
        System.out.println("----------------------");
        System.out.println();


    }

}
