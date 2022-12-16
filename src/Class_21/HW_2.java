package Class_21;

public class HW_2 {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
} class CreditCard{
    double balance;
    double interest;
    void calculateInterest( double balance){
        interest= 2.3/100;
        System.out.println( "interest amount is "+ balance*interest );
    }
} class Visa extends CreditCard{

} class Ax extends CreditCard{
    void calculateInterest( double balance){
      double  interest= 4.5/100;
        System.out.println(  "interest amount is "+ balance*interest );
}} class InterestCalculate {
    public static void main(String[] args) {
        new CreditCard().calculateInterest(500.0);
        new Visa().calculateInterest(500.0);
        new Ax().calculateInterest(500.0);
    }

}