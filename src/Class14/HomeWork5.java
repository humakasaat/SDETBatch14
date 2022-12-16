package Class14;

public class HomeWork5 {
    //Create a method createEmail(). Based on values of users name,
    // lastName and email type, your method should return complete email Address. Example:  createEmail(John, Snow, gmail) →
    // johnsnow@gmail.com or
    void email( String firstName, String lastName, String emailType){
        System.out.println(firstName+lastName+ "@"+emailType +"com");
    }

    public static void main(String[] args) {
        HomeWork5 emailaddres=new HomeWork5();
        emailaddres.email("huma","kassat","gmail");
    }
}
