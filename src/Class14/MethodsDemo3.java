package Class14;

public class MethodsDemo3 {
    boolean isEven(int number){
        if(number%2==0){
            return true;
        } else{
            return false;
        }

    }

    public static void main(String[] args) {
        MethodsDemo3 md=new MethodsDemo3();
        if(md.isEven(4)){
            System.out.println("Number is even");

        } else{
            System.out.println("number is odd");
        }
    }
}
