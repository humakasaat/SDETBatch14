package Class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypeOfSet {
    public static void main(String[] args) {
      // There are three type of sets
      // Down -Side HashSet: it does not care about the insertion order
      //  Upside->It is the fastest type of set//the order when you insert the data

        HashSet<String> letters= new HashSet<>();
        letters.add("Mango");
        letters.add("Apple");
        letters.add("Orange");
        letters.add("Kiwi");
        letters.add("Banana");
        System.out.println(letters);
        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
        // insertion speed is same as HashSet, but the retrieval speed is the worst
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Banana");
        System.out.println(linkedHashSet);
        // TreeSet
       TreeSet<String> treeSet= new TreeSet<>();
       // When we need insertion order// *Ascii table
        // it is the slowest, and takes more memory than hashset

        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Kiwi");
        treeSet.add("Banana");
        System.out.println(treeSet);

    }

}
