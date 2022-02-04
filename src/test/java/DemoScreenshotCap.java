import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class DemoScreenshotCap {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("file:///C:/Users/admin/Downloads/Prompt.html");
        driver.manage().window().maximize();

        TakesScreenshot st = ((TakesScreenshot) driver);
        File src = st.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("F:\\Screenshot.png"));






    }
}
