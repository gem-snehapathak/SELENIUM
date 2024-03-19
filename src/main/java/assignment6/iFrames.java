package assignment6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class iFrames {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        WebElement frame =driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
        driver.switchTo().frame(frame);
        WebElement frame1 =driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("sneha");
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).click();
        WebElement frame2 = driver.findElement(By.xpath("//*[@id='singleframe']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("akshit");

    }
}