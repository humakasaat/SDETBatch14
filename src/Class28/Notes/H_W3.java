package Class28.Notes;

import java.util.HashMap;

public class H_W3 {
    public static void main(String[] args) {
      //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.
        HashMap<String,Integer> bestBuy= new HashMap<>();
        bestBuy.put("Printer",589045);
        bestBuy.put("TV",589056);
        bestBuy.put("DishWasher",59045);
        bestBuy.put("Computer",589045);
        var items= bestBuy.entrySet();
        System.out.println(items);



    }
}
