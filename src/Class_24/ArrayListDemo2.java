package Class_24;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //<int> Arraylist won't store primitive data type.
        //Wrapper classes,
        //int=Integer   //boolean=Boolean   //byte= Byte   //double=Double  //float=Float  // char =Character
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        int a= 34;
        numbers.add(a);
        System.out.println(numbers);
        for (Integer num:numbers){
            System.out.println(num);
        }

    }
}
