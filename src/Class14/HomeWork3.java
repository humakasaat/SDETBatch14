package Class14;

public class HomeWork3 {
    //Create a method that will print whether given String is palindrome or not.
    void palindrome( String a){
        StringBuilder stringBuilder= new StringBuilder(a);
        stringBuilder.reverse();
        String name= stringBuilder.toString();
        if(a.equals(name)){
            System.out.println(name+" name is palindrome");
        } else {
            System.out.println(name+ " name is not palindrome");
        }
    }

    public static void main(String[] args) {
        HomeWork3 b= new HomeWork3();
        b.palindrome("mom");
        b.palindrome("huma");
    }
}
