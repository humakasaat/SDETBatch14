package Class13;

public class HomeWork3 {
    public static void main(String[] args) {
        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?
        String str="Is it sunday? is it sunny? Do we have Java class today?$";
        String []b= str.split("[?]");
        int size= b.length;
        System.out.println("there are " +size+ " sentences are in that String");
    }
}
