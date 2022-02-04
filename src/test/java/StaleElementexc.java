import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementexc {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();

        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("Kyrie Irwing");

        driver.navigate().refresh();
        Thread.sleep(4000);
        username.sendKeys("Kobe Bryant");

    }
}
