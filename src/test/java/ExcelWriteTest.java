import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteTest {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        FileInputStream fl = new FileInputStream(System.getProperty("user.dir")+"\\TestDataSheet.xlsx");
        XSSFWorkbook wb= new XSSFWorkbook(fl);
        XSSFSheet sheet= wb.getSheetAt(0);
        sheet.getRow(1).getCell(1).setCellValue("try");

        FileOutputStream fw = new FileOutputStream(System.getProperty("user.dir")+"\\TestDataSheet.xlsx");
        wb.write(fw);
        fw.close();


    }
}
