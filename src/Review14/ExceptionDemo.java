package Review14;

public class ExceptionDemo {
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            throw new AgeNotAllowed("You should not be here");
        }
    }
}
