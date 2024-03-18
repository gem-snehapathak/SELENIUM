package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//         ALERT BOX

//        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//        driver.manage().window().maximize();
//        WebElement frame1 = driver.findElement(By.id("iframeResult"));
//        driver.switchTo().frame(frame1);
//        driver.findElement(By.xpath("/html/body/button")).click();
//        String alerttext = driver.switchTo().alert().getText();
//        System.out.println(alerttext);
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//        driver.switchTo().parentFrame();
//        System.out.println(driver.getTitle());
//
//        driver.quit();

//       PROMPT METHOD

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
        WebElement frame2 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("/html/body/button")).click();
        Thread.sleep(2000);
        Alert alertonWeb = driver.switchTo().alert();
        alertonWeb.sendKeys("snehuu");
        Thread.sleep(2000);
        alertonWeb.accept();

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());



    }
}
