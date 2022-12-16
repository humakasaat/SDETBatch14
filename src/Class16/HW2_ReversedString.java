package Class16;

public class HW2_ReversedString {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public  String reversed( String abc){
        StringBuilder stringBuilder= new StringBuilder(abc);
        stringBuilder.reverse();
        String result= stringBuilder.toString();
        return result;
    }

    public static void main(String[] args) {
        HW2_ReversedString obj= new HW2_ReversedString();
        System.out.println( obj.reversed("Java"));
        System.out.println(obj.reversed("Sunday"));
    }
}
