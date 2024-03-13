package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tricentis.com/");
        driver.findElement(By.xpath("//*[local-name()=\"svg\" and @height=\"25\"]")).click();
        Thread.sleep(3000);
        driver.quit();


    }

}
