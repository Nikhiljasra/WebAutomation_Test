import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

        Properties prop = new Properties();
        FileInputStream fl = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\WebAutomation_Test\\Testdata.proprties");
        prop.load(fl);

        System.out.println(prop.getProperty("url"));
        String vURL = prop.getProperty("url");
        String vUsername= prop.getProperty("username");
        driver.get(vURL);
        driver.findElement(By.name("email")).sendKeys(vUsername);

        FileOutputStream op =new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\WebAutomation_Test\\Testdata.proprties");
        prop.setProperty("password","asdf");
        prop.store(op,"comments");
    }
}
