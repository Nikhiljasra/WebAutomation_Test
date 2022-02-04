import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Input {
    public static void main(String[] args) {


//        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Inputs")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("12346789");

    }
}
