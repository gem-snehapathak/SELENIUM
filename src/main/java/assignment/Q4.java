package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =  new ChromeDriver();
        driver.get("https://id.wisepops.com/login");

        driver.findElement(By.xpath("//div[@class=\"sc-kqGoIF hzXBsn\"]")).click();

        driver.quit();

    }
}
