package Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3ArrayListOfeven {
    //Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }

        }

        Iterator<Integer> iterator = evenNumbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 5 == 0) {
                iterator.remove();
            }

        }

        System.out.println(evenNumbers);
    }}