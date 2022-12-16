package Class_24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("Mj");
        names.add("Josh");
        names.set(2,"Josh Again");// is replacing the contestant on the index
       //  names.add(2,"Josh Again");
        System.out.println(names);
         ArrayList<Integer> numbers= new ArrayList<>();
         numbers.add(10);
         numbers.add(25);
         numbers.add(35);
         numbers.add(1,100);
         System.out.println(numbers);
         numbers.clear();// it will delete the elements from the list
        System.out.println(numbers);



}}
