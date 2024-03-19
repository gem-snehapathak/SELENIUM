package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class explicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//div[@id='vl-flyout-nav']//child::ul//child::li[@class='vl-flyout-nav__js-tab']//child::a[@_sp='p4375194.m1379.l3250']"));

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vl-flyout-nav']/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[3]/a"))).click();

        driver.quit();
    }
}
