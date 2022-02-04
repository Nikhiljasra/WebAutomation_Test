import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestScreenshot {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException {
        try{
            WebDriverManager.chromedriver().setup();
            //        WebDriverManager.firefoxdriver().setup();
             driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

            driver.get("https://googles.com");
            driver.manage().window().maximize();
            List<WebElement> lst = driver.findElements(By.name("q"));

        }
        catch(Throwable t)
        {
            System.out.println("Test Case is failed");
            TakesScreenshot st = ((TakesScreenshot)driver);
            File src = st.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("F:\\Gcreenshot.png"));




        }
    }
}
