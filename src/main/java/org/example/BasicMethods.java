package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BasicMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/"); //1.get()
        driver.manage().window().maximize();  //2. manage()

        String Url = driver.getCurrentUrl();   //3.getCurrentUrl
        System.out.println(Url);

        String title = driver.getTitle();      //4.getTitle
        System.out.println(title);

        String pageSource= driver.getPageSource(); //5.getPageSource
        System.out.println(pageSource);

         //       driver.navigate().to("https://www.amazon.in/");    //6.navigate()

        //        driver.close();                                  //7.close()
       //         driver.quit();                                   // 8.quit()

        driver.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys("standard_user"); //9.findElement
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        List<WebElement> webElements = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div")); //10.findElements
        System.out.println(webElements);

        driver.navigate().to("https://www.google.com");
        String windowhandle = driver.getWindowHandle();    //11. getWindowHandle()
        System.out.println(windowhandle);

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[1]/a[2]")).click();
        Set<String> windowhandle1 = driver.getWindowHandles(); //12.getWindowHandles()
        System.out.println(windowhandle1);

        driver.quit();





    }
}
