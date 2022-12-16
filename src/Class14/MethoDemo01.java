package Class14;

public class MethoDemo01 {
    void printHello(){
        System.out.println("HEllo world");
        System.out.println("Hello java");
        System.out.println("Hello Aladin");

    }
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethoDemo01 obc=new MethoDemo01();
        obc.printHello();
        obc.printWord("Don't worry its java");
        obc.printWord("java is cool");
    }
}
