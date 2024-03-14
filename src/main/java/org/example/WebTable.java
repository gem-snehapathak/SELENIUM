package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        int columnCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();


        for(int i=1;i<rowCount;i++){
            for(int j=1;j<=columnCount;j++){
                String val = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
                if(val.equals("Italy")) {
                    System.out.println(i + " : " + j);
                    break;
                }
            }
        }
driver.quit();

    }
}
