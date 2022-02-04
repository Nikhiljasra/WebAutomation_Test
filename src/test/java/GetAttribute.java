import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

//        Boolean bol = driver.findElement(By.name("email")).isDisplayed();
        String ActualValue = driver.findElement(By.name("email")).getAttribute("value");
        if(ActualValue.equals("Jordan"))
        {
            System.out.println("Testcase is passed and username is visible");
        }
        else
        {
            System.out.println("Testcase is failed and username is not visible on the webpage");
        }


    }
}
