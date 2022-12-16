package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2Drinks {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("tea");
        drinks.add("coffee");
        drinks.add("Apple Juice");
        drinks.add("Pepsi");
        drinks.add("Lasi");
        drinks.add("Coke");
        drinks.add("Sprite");
        drinks.add("Mountain-Dew");
        drinks.add("Dr-Paper");
        drinks.add("Crush Cream Soda");
        Iterator<String> iterator= drinks.iterator();
        while (iterator.hasNext()){
            String drink=iterator.next();
          if( drink.contains("a")|| drink.contains("e")){
              drinks.set(drinks.indexOf(drink),"Water");
          }

        }
        System.out.println(drinks);
    }


}

