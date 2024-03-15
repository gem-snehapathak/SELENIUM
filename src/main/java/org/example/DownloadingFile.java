package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadingFile {
    public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();

            ChromeDriver driver = new ChromeDriver();
            driver.get("https://omayo.blogspot.com/p/page7.html");
            driver.manage().window().maximize();
            driver.findElement(By.linkText("ZIP file")).click();

            driver.quit();

        }
}
