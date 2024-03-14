package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class printAllLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        List<WebElement> alltags = driver.findElementsByTagName("a"); //can be used for options
        System.out.println("total tags are: " + alltags.size());

        for(int i=0;i<alltags.size();i++){
            System.out.println("Links on page are: " + alltags.get(i).getAttribute("href"));
            System.out.println("Links on page are: " + alltags.get(i).getText());

        }

        driver.quit();

    }
}
