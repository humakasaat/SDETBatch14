package Class27;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit= new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

      //  Collection<Double> values=fruit.values();// returns all the values from a map
      //  Iterator<Double> iterator= values.iterator();
      //  while(iterator.hasNext()){
      //      Double value= iterator.next();
      //      if(value>2){
       //         iterator.remove();
       //     }
      //  }
        fruit.values().removeIf(x->x>2); //lambda - funktional programming in OOP

        System.out.println(fruit);

    }
}
