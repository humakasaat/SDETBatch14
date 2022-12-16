package Class17;
//Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3
// - from different class inside different package  and observe result.
 public class Patien {
    String name;
    String lastName;
    String city;
    String state;
    String street;
    int zipCode;
    int age;
    char gender;
    long group_number;
    long id_number;
    String subscriber;
    String employer;

     public Patien(String pName , String lName, int pAge ){
         name=pName;
         lastName=lName;
         age=pAge;
     } private Patien( String pCity, String pState, String pStreet ){
         city= pCity;
         state=pState;
         street=pStreet;
     } protected Patien ( char pGender ){

        this.gender= pGender;
     }
    public static void main(String[] args
    ) {
         Patien a= new Patien( "Fayez","kasaat",4);
         Patien b= new Patien( "Brambelton", "Virgina","Spring" );
         Patien c= new Patien('M');
     }

}
