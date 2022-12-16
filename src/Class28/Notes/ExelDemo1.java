package Class28.Notes;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDemo1 {
    public static void main(String[] args) throws IOException {
        // we need to know path of the file
        String path="/Users/humakasaat/IdeaProjects/SDETBatch14java/Data/Test.xlsx";
        // navigate to this path
        FileInputStream fileInputStream= new FileInputStream(path);
        // that special that can handle the xlsx files
        XSSFWorkbook exelFile= new XSSFWorkbook(fileInputStream);
        Sheet sheet= exelFile.getSheet("Sheet1");
        Row row0= sheet.getRow(0);
        System.out.println(row0.getCell(0));
        // get the data from 1
        Row row1= sheet.getRow(1);
        System.out.println(row1.getCell(0));




    }
}
