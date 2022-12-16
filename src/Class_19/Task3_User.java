package Class_19;

public class Task3_User {
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.
    String name;
    String mobNumber;
    Task3_User( String name, String mobNumber){
        this.name=name;
        this.mobNumber=mobNumber;}

        }

 class UserInfo extends  Task3_User{
    String address;
    UserInfo( String name, String mobNumber,String address){
        super( name, mobNumber);
        this.address=address;}
  void info() {
      System.out.println( " name is  "+ name+ " mobile number is "+ address+ " address");
  }}
   class Tester_ {
       public static void main(String[] args) {
       UserInfo userinfo= new UserInfo( " Ali", " 456 345 678", " Spring road");
       userinfo.info();



           }}




