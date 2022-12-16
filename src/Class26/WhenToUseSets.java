package Class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
// sets are another set of datastructures in collection framework that allow us to store only unique data
//  we can also use set to remove duplicate data from list
public class WhenToUseSets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println("------------------------------");
        System.out.println(new LinkedHashSet<>(numbers));
        HashSet<Integer> hashSet= new HashSet<>(numbers);
        System.out.println("---------------------------------");
        System.out.println(hashSet);
        System.out.println("-----------------------------------");
        LinkedList<Integer> linkedList= new LinkedList<>(hashSet);
        System.out.println(linkedList);


    }
}
