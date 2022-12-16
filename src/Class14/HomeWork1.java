package Class14;

import java.util.Scanner;

public class HomeWork1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void LargestNumber( int num1, int num2 ){
        if( num1>num2){
            System.out.println(num1+" is the largest number");
        }else if( num2> num1){
            System.out.println(num2+" is the largest number");
        }  else {
            System.out.println(" numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the first number");
         int num1=scanner.nextInt();
        System.out.println("please enter the second number");
        int num2= scanner.nextInt();
        HomeWork1 a = new HomeWork1();
        a.LargestNumber(num1,num2);
        a.LargestNumber(100,100);

    }
}
