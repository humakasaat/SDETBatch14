package Class14;

public class HomeWork6 {
    //Write a method to return whether given number is prime or not?
    //note(A prime number is a whole number greater than 1 whose only factors are 1 and itself. A factor is a whole number that can be divided evenly into another number. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
    // Numbers that have more than two factors are called composite numbers.)

        /*Write a method to return whether given number is prime or not?*/
        boolean isPrime(int num){
            boolean isPrime=true;
            if (num > 1) {

                for(int i=2;i<num;i++) {
                    if(num%i==0) {
                        isPrime=false;
                        break;
                    }
                }
            }else {
                isPrime=false;
            }

            return isPrime;
        }

        public static void main(String[] args) {
            HomeWork6 task6=new HomeWork6();
            System.out.println(task6.isPrime(12));
            System.out.println(task6.isPrime(5));
        }
    }