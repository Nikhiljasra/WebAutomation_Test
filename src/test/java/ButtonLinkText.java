import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonLinkText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");
         driver.findElement(By.linkText("Add/Remove Elements")).click();
         //driver.findElement(By.xpath("//button[text()='Add Element']")).click();
         driver.findElement(By.xpath("//input[@type='number']")).sendKeys("12346789");



    }



}
