import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrokenImages {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
//       ?\ driver.findElement(By.linkText("Broken Images").click();

//        driver.findElement(By.xpath("//a[normalize-space()='Broken Images']")).click();
//        driver.findElement(By.linkText("Inputs")).getAttribute("src");
        driver.findElement(By.linkText("Broken Images")).click();
        List<WebElement> Broken = driver.findElements(By.tagName("img"));
        System.out.println("size="+Broken.size());
        for(WebElement i:Broken)
        {
//         System.out.println("name="+ i.getAttribute("src").split("/"));
            System.out.println("name="+ i.getAttribute("src"));

        }

    }
}
