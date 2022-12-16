package Class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class WhySet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println("-----------------------------------------");
        LinkedHashSet<Integer> setNumbers= new LinkedHashSet<>();
        // a set dose not allowed duplicate value
        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(10);
        System.out.println(setNumbers);
    }
}
