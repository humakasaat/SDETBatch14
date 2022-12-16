package Class30;

import Utils.ConfigReader;

import java.io.IOException;

public class TypeOfException {
    static ConfigReader ExcelReader;

    public static void main(String[] args) {
        String name=null;
        if(name!=null){
            System.out.println(name.length());
        }

        int [] arr=new int[5];
        int index=10;
        try {
            System.out.println(arr[index]);
        }catch (Exception e){
            System.out.println("Josh please fix your issues you never write good code");
        }

        if(index<arr.length){
            System.out.println(arr[index]);
        }


        try {
            System.out.println(ExcelReader.read("Data/Test.xlsx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}




// notes:Unchecked Exceptions can be avoided by writing a better code but checked Exceptions are not lightweight exceptions,
// we must use try and catch or add exception to the method signature to avoid them.
//Check exception are those which are not in control of programmer
// Uncheked are run type exception can be avoided with good coding/try-catch