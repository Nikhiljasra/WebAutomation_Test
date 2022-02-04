import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com");
//        driver.findElement(By.linkText("Inputs")).click();
        driver.manage().window().maximize();
          driver.findElement(By.linkText("Checkboxes")).click();
          List<WebElement> lst = driver.findElements(By.xpath("//input[@type='checkbox']"));
          lst.get(2).click();



    }
}
