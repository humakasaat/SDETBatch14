package Class_24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // Syntax to crate an ArrayList
        ArrayList<String> colors=new ArrayList<>();
        // use add method to insert elements in arryist
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        // print all elellments
        System.out.println(colors);
        System.out.println("-------------------------------");
        //get method print indivisula element from arrylist
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        System.out.println("----------------------------------");
        System.out.println(colors.size());
        System.out.println("----------------------------------");
        for ( int i=0; i< colors.size(); i++){
            System.out.println(colors.get(i));
        }
        System.out.println("----------------------------------");
        for(String color:colors){
            System.out.println(color);
        }
    }
}
