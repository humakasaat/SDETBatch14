package Class14;

public class Task2 {
    public static void main(String[] args) {
        String str="ajjunkfg ASDFGH 123 %#*";
        str= str.replaceAll("[^a-zA-z0-9]","");
        System.out.println("str ="+str);
        System.out.println(str.length());
    }
}
