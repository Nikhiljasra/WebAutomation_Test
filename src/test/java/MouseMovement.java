import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
    public static void main(String[] args) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
             WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new ChromeDriver();
       WebDriver driver = new FirefoxDriver();

        driver.get("https://sellglobal.ebay.in/seller-center/");
        driver.manage().window().maximize();


        Actions act= new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Seller Updates"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("Seller Training Sessions"))).build().perform();


        driver.findElement(By.linkText("Seller Training Sessions")).click();
        Thread.sleep(9000);
    }
}
