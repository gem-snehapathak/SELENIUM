package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class multipleWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"1707962206997_xa6\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
        Thread.sleep(2000);
        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);

        Iterator<String> iterator = windowhandles.iterator();
        String parent = iterator.next();
        System.out.println(parent);
        String child = iterator.next();
        System.out.println(child);

        driver.switchTo().window(child);

        driver.findElement(By.name("UserFirstName")).sendKeys("SNEHA");
        driver.findElement(By.name("UserLastName")).sendKeys("PATHAK");
        Thread.sleep(2000);
        driver.switchTo().window(parent);

    }
}
