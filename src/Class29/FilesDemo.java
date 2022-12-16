package Class29;

import Utils.ConfigReader;

import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        String path="/Users/humakasaat/IdeaProjects/SDETBatch14java/Data/Test.xlsx";
        var properties=  ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));


        String excelPath="/Users/humakasaat/IdeaProjects/SDETBatch14java/Data/Test.xlsx";
      // var excelData=  ExcelReader.read(excelPath);
      // System.out.println(excelData);

    }}
