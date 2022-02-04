import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class SingleWebTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("file:///C:/Users/admin/Downloads/WbTable.html");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[1]")).getText());




    }


    }