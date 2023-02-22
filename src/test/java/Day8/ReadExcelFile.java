package Day8;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        String path =System.getProperty("user. dir")+ File.separator+"Studentdetails.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb =new XSSFWorkbook(fis);
        Sheet sheet = (Sheet) wb.getSheet("details");
        int LastrowNum=sheet.g
        System.out.println("Value: " + Sheet);


    }
