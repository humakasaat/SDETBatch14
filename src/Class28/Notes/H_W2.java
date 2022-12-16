package Class28.Notes;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class H_W2 {
    public static void main(String[] args) {
     //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.
        TreeMap< String, String> countries= new TreeMap<>();
        countries.put("Afghanistan","Kabul");
        countries.put("Denmark","Copenhagen");
        countries.put("Canada","Ottawa");
        countries.put("Egypt","Cairo");
        countries.put("Bangladesh","Dhaka");
        countries.put("France","Paris");
        System.out.println("Print all keys and values from a country map using for each loop and iterator");
        Iterator<Map.Entry< String, String>> iterator=  countries.entrySet().iterator();
        while ( iterator.hasNext()){
            var items=iterator.next();
            System.out.print( items+" ,");
        }
        System.out.println("/");
        System.out.println("Print all values from a country map using iterator");
        System.out.println("/");
        var values= countries.values().iterator();
        while(values.hasNext()){
            var capitals= values.next();
            System.out.print(capitals+", ");
        }
        System.out.println();
        System.out.println("Print all keys using for eac loop");
        Set<String> keySet= countries.keySet();
        for ( String country:keySet
             ) {
            System.out.print(country+" ");

        }
        }






    }

