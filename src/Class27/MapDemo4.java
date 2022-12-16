package Class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit= new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);
        Set<String> keySet=fruit.keySet();
        System.out.println(keySet);
        System.out.println("----------------------");
        Set<String> allKeys= fruit.keySet();// getting all the keys in form of a set

        Iterator<String> iterator= allKeys.iterator();// getting an iterator on that set

          while( iterator.hasNext()){
            String item= iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }
        System.out.println(fruit);
      //    fruit.keySet().removeIf(x->x.contains("n"));
     //   System.out.println(fruit);

    }
}
