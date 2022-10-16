package cydeo.step_definitions;

import org.apache.poi.xssf.usermodel.*;
import org.junit.Test;

import java.io.*;

public class ExcelRead {

    @Test
    public void readExcelFile() throws IOException {
        String path = "sample.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Finance");
        System.out.println(sheet.getRow(2).getCell(1));
        System.out.println(sheet.getRow(5).getCell(2));

        System.out.println(sheet.getPhysicalNumberOfRows());
        System.out.println(sheet.getLastRowNum());

    }


    @Test
    public void writeExcel() throws IOException {
        String path = "sample.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Finance");

        XSSFCell date = sheet.getRow(0).createCell(3);
        date.setCellValue("Date");

        XSSFCell date1 = sheet.getRow(1).createCell(3);
        date1.setCellValue("10/12");

        XSSFCell date2 = sheet.getRow(2).createCell(3);
        date2.setCellValue("14/05");

        XSSFCell date3 = sheet.getRow(3).createCell(3);
        date3.setCellValue("13/06");


        FileOutputStream fos = new FileOutputStream(path);

        workbook.write(fos);

        fos.close();
        workbook.close();
        fis.close();


    }
}
