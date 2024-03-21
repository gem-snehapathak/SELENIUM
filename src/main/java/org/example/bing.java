package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilityClass.Driver;

import static utilityClass.Driver.driver;

public class bing {
    public static void main(String[] args) throws InterruptedException {


        Driver.setup("https://www.bing.com/");
        WebElement click = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
        click.sendKeys("cat");
//        driver.findElement(By.xpath("//*[local-name()='svg' and @aria-hidden=\"true\" and @width=\"25\"]")).click();
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        click.submit();
//        actions.moveToElement(click).sendKeys(Keys.ENTER).build().perform();
    }

}