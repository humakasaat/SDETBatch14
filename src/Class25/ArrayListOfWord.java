package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfWord {
    public static void main(String[] args) {
       //Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> word= new ArrayList<>();
        word.add("Apple");
        word.add("mango");
        word.add("computer");
        word.add("Tomatoes");
        word.add("Strawberry");
        word.add("Juice");
        word.add("eye");
        Iterator<String> iterator=word.iterator();

        while (iterator.hasNext()){


            if(iterator.next().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(word);

    }
        }




