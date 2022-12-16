package Class13;

public class HomeWork5 {
    public static void main(String[] args) {
        //6 How would you check if String is palindrome or not? aba=> true
//Abbc =>false
        String a = "anna";
        char[] b = a.toCharArray();
        String c = "";

        for (int i = b.length - 1; i >= 0; i--) {
            c += b[i];
        }System.out.println(c.equals(a));
    }
}
