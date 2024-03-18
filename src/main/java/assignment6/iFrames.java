package assignment6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        WebElement frame =driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("sneha");
//        driver.findElement(By.xpath(""))
    }
}