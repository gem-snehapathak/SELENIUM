package assignment4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertsandpopups {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        1.
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.manage().window().maximize();
//        2.
        driver.findElement(By.xpath("//*[@id='page-top']/div/div/div/div/div/div[2]/input[1]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
//        3.
        driver.findElement(By.xpath("//*[@id='page-top']/div/div/div/div/div/div[2]/input[2]")).click();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
//        4.
        driver.findElement(By.xpath("//*[@id='page-top']/div/div/div/div/div/div[2]/input[3]")).click();
        Alert promptbox = driver.switchTo().alert();
        promptbox.sendKeys("Snehaaa");
        Thread.sleep(2000);
        promptbox.accept();
        Thread.sleep(1000);
//        5.
        WebElement bttn = driver.findElement(By.id("double-click"));
        Actions action = new Actions(driver);
        action.doubleClick(bttn).build().perform();
        String text1 = driver.switchTo().alert().getText();
        System.out.println(text1);
        driver.switchTo().alert().dismiss();
//        6.
        WebElement hover = driver.findElement(By.xpath("//*[@id='sub-menu']"));
        Actions action1 = new Actions(driver);
        action1.moveToElement(hover).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("link2")).click();
        Thread.sleep(2000);

        driver.quit();
    }

}
