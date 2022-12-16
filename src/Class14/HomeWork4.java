package Class14;
//Create a method that will say Hello in different language based on the country that will passed when method is executed
public class HomeWork4 {
    void countryLanguage( String sentences){
        switch (sentences) {
            case "Afghanistan":
                System.out.println("salam");
                break;
            case "USA":
                System.out.println("hello");
                break;
            case "China":
                System.out.println("nin hao");
                break;
            case "Japan":
                System.out.println("konnichiwa");
                break;
            default:
                System.out.println("language is invalid");
                break;
        }
    }

    public static void main(String[] args) {
        HomeWork4 lan= new HomeWork4();
        lan.countryLanguage("Afghanistan");
    }
}
