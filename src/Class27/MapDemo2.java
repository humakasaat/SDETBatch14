package Class27;

import java.util.LinkedHashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String ,Double> beautyProducts= new LinkedHashMap<>();
        beautyProducts.put("Foundation",50.50);
        beautyProducts.put("Blush",20.0);
        beautyProducts.put("LipStick",10.5);
        LinkedHashMap<String ,Double> cosmetics= new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("conditioner",20.2);
        cosmetics.put("Shampoo",30.2);

        LinkedHashMap<String ,Double> grocery= new LinkedHashMap<>();

        grocery.putAll(beautyProducts);

        System.out.println(grocery);

        System.out.println("---------------------------------------");

        grocery.putAll(cosmetics);

        System.out.println(grocery);
        System.out.println("---------------------------");

        System.out.println(grocery);


    }
}
