package Class_19;

public class Task2_A {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    String name;
    int age;
    static void printF(){
        System.out.println(" java is hard");
    }

    }
    class Task2_B extends Task2_A{
    public static void main(String[] args) {
        Task2_B.printF();

    }
}

