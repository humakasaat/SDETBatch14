package Class28.Notes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path= "Data/config.properties";// the location of the file
        FileInputStream fileInputStream= new FileInputStream(path);//  it helps us to Navigate to the file
        Properties properties= new Properties();//special software wich help us read data from that file
        properties.load(fileInputStream);// load all the data from the file inside (Memory)
        System.out.println(properties.getProperty("URl"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();


    }
}
