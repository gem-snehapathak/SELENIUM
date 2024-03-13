package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiselectDd {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("");
        driver.manage().window().maximize();

        WebElement ddown = driver.findElement(By.id(""));
        Select select = new Select(ddown);

        select.selectByIndex(6);
        Thread.sleep(2000);
        select.selectByValue("");
        Thread.sleep(2000);


        List<WebElement> allitems = select.getAllSelectedOptions();
        System.out.println(allitems.size());
        select.deselectAll();
        Thread.sleep(2000);

        select.selectByIndex(7);
        Thread.sleep(2000);
        select.selectByValue("");
        Thread.sleep(2000);


        select.deselectByIndex(7);
        List<WebElement> allitems1 = select.getAllSelectedOptions();
        System.out.println(allitems1.size());




    }
}
