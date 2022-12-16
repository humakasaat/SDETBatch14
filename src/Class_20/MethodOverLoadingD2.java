package Class_20;

public class MethodOverLoadingD2 {
    static void F1( String name, int num){
        System.out.println(name+" " + num);
    } void F1( String name, int num, int num2){
        System.out.println(name+" " + num+ num2);
} void F1(  int num1, int num2){
        System.out.println( num1+" " + num2);
}void F1(int num ,String name){
        System.out.println(name+" " + num);
}

    public static void main(String[] args) {
        MethodOverLoadingD2 md=new MethodOverLoadingD2();
        md.F1( " huma",30);
    }
}
