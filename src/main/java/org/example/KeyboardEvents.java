package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://extendsclass.com/text-compare.html");
        driver.manage().window().maximize();

        WebElement area = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[2]/pre/span"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.keyDown(area, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        WebElement area1 = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[10]/pre"));
        Thread.sleep(2000);
        action.keyDown(area1, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();




    }
}
