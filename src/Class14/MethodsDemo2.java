package Class14;

public class MethodsDemo2 {
    void printManyTimes(int times){
        for( int i=0; i<times; i++){
            System.out.println("HEellojava");
        }
    }
    void printCustomerWordManyTimes(String word, int times){
        for(int i=0;i<times;i++){
            System.out.println(word);
        }

    }

    public static void main(String[] args) {
        MethodsDemo2 md=new MethodsDemo2();
        md.printManyTimes(3);
        md.printCustomerWordManyTimes("Syntax easy",2);
    }
}
