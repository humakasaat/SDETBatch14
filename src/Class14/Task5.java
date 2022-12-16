package Class14;

public class Task5 {
    public static void main(String[] args) {
        //6 How would you check if String is palindrome or not? aba=> true
      //Abbc =>false
       String str="dad";
        StringBuilder stringBuilder= new StringBuilder(str);
        stringBuilder.reverse();
        if( stringBuilder.toString().equals(str)){
            System.out.println("the String is palindrome");
        }else {
            System.out.println("the string is not palindrome");
        }
    }
}
