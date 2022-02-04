import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.name("email")).sendKeys("Westbrook");
        String cssvalue= driver.findElement(By.name("email")).getCssValue("color");
        System.out.println(cssvalue);


    }
}
