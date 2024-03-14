package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://designsystem.digital.gov/components/checkbox/");
        driver.manage().window().maximize();
        WebElement component= driver.findElement(By.xpath("//a[@id='component-code']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(component);
        actions.perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath(" //input[@id='check-historical-truth']//parent::div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //input[@id='check-historical-truth']//parent::div")).click();

        System.out.println(driver.findElements(By.xpath("//div[@class='usa-checkbox']")).size());



        driver.quit();

    }
}
