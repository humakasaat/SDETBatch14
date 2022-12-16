package Class_24;

import java.util.ArrayList;

public class ArrayListHome_Work {
    public static void main(String[] args) {
    //Create an ArrayList that will store 5 names into it. //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?//Find the size of your arrayList and print all values from that
    ArrayList<String> names= new ArrayList<>();
    names.add("Ahmad");
    names.add("Ali");
    names.add("Tasnim");
    names.add("Javed");
    names.add("Bob");
    if( names.isEmpty()){
        System.out.println("Empty");
    }
    else if( names.contains("Ali")){
        System.out.println(" Ali is a student ");
    }
        System.out.println(" Size of the Array List is "+names.size());
        System.out.println(names);

}}
