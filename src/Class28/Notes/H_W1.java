package Class28.Notes;

import java.util.HashMap;

public class H_W1 {
    //Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map
    public static void main(String[] args) {
        HashMap<String, Integer> buildings= new HashMap<>();
        buildings.put("Google",1);
        buildings.put("Syntax",2);
        buildings.put("Youtube",3);
        buildings.put("Amazon",4);
        buildings.put("Microsoft",5);
        buildings.put("Youtube",6);
        buildings.put("Google",7);
        int floors= buildings.size();
        System.out.println( "the size of entries is "+floors);
        buildings.replace("Ebay",4);
        buildings.remove(7);
        System.out.println("----------------------");
        System.out.println("update floors in the building"+ buildings);





    }
}
