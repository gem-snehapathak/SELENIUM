package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com"); //1.get()
        driver.manage().window().maximize();  //2. manage()

        String Url = driver.getCurrentUrl();   //3.getCurrentUrl
        System.out.println(Url);

        String title = driver.getTitle();      //4.getTitle
        System.out.println(title);

        String pageSource= driver.getPageSource(); //5.getPageSource
        System.out.println(pageSource);

        driver.navigate().to("https://www.amazon.in/");   //6.navigate()
        driver.close();                             //7.close()
                                                    //8.quit()


    }
}
