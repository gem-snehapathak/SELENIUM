package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class radioBttn {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();

        WebElement radio1 = driver.findElement(By.id("male"));
        WebElement radio2 = driver.findElement(By.id("female"));

        radio1.click();
        System.out.println( radio1.isSelected());
        System.out.println( radio2.isSelected());

        Thread.sleep(2000);

//        driver.quit();

    }
}
