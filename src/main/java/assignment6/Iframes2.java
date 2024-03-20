package assignment6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Iframes2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.xpath("//*[@id='frame1']"));
        driver.switchTo().frame(frame);
        WebElement frame1 = driver.findElement(By.xpath("//*[@id='frame3']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//*[@id='a']")).click();
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("/html/body/input")).sendKeys("SNEHA");
        driver.switchTo().parentFrame();
        WebElement frame2 = driver.findElement(By.xpath("//*[@id='frame2']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//*[@id='animals']")).click();
        driver.findElement(By.xpath("//*[@id='animals']/option[3]")).click();

        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());


        driver.quit();




    }
}
