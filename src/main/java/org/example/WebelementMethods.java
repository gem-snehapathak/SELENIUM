package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Gemini solutions"); // 1.sendKeys()
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).clear(); //2.clear()
        System.out.println(driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).getAttribute("aria-expanded"));
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).getCssValue("font-family"));
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).getSize());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).getLocation());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/a[1]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).getTagName());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).isEnabled());
        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).isSelected());

        driver.quit();
    }
}
