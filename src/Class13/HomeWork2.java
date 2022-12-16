package Class13;

public class HomeWork2 {
    public static void main( String[] args){
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        String str= " AbcjkfueuwIfyhcjk1239";
        System.out.println( str.replaceAll("[0-9]",""));
        System.out.println( str.replaceAll("[A-Z]",""));
        System.out.println( str.replaceAll("[a-z]",""));

        System.out.println( str.replaceAll("[^a-zA-z]"," "));
        System.out.println( str.replaceAll("[a-zA-Z]","Java is hard and fun"));
        System.out.println(str.length());

    }
}
