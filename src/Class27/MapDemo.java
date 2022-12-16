package Class27;

import java.util.HashMap;

public class MapDemo {
    // Maps are not part of collection framework, because it hase two values
    //it is like when we set our webdriver System.setProperty (Key, Value)
    public static void main(String[] args) {
        HashMap<String,String> data= new HashMap<>();
        data.put("UserName","Anton123"); // one is key and second value,we can say that the key is the varibale name and the value is the value of that varibale
        data.put("Password","pass123");
        System.out.println(data);
        System.out.println(data.get("Password"));

    }
}
