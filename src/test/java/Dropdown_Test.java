import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown_Test {
    public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
  WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com");
//        driver.findElement(By.linkText("Inputs")).click();
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dropdown")).click();
//        driver.findElement(By.id("dropdown")).sendKeys("option 1");
        driver.findElement(By.xpath("//select[@id='dropdown']")).sendKeys("option 1");
//        driver.findElement(By.xpath("//input [1]")).click();
    }
}
