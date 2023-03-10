package Class28.Notes;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Data/Test.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        XSSFWorkbook excel= new XSSFWorkbook(fileInputStream);
        Sheet sheet= excel.getSheet("Sheet1");
        int noOfRows= sheet.getPhysicalNumberOfRows();// this method will return the in actul contains the data
        System.out.println(noOfRows);
        for( int i= 0; i<noOfRows; i++){
            Row row= sheet.getRow(i);
            int noOfCell= row.getPhysicalNumberOfCells();// return the total numbers of cells that contains the data
            for( int j= 0; j<noOfCell;j++){
                Cell cell= row.getCell(j) ;
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }
}
