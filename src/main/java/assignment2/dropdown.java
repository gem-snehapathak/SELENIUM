package assignment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/sneha.pathak/Downloads/Dropdown.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement ddown = driver.findElement(By.name("dob-day"));
        ddown.click();
        Select date = new Select(ddown);
        date.selectByValue("05");
        Thread.sleep(1000);

        WebElement ddown1 = driver.findElement(By.id("dob-month"));
        ddown1.click();
        Select month = new Select(ddown1);
        month.selectByValue("05");
        Thread.sleep(1000);

        WebElement ddown2 = driver.findElement(By.name("dob-year"));
        ddown2.click();
        Select year = new Select(ddown2);
        year.selectByValue("2005");

        String dob = date.getFirstSelectedOption().getText();
        dob = dob+"-"+month.getFirstSelectedOption().getText();
        dob = dob+"-"+year.getFirstSelectedOption().getText();

        if (dob.equals("05-May-2005")){
            System.out.println("DOB Validation Successfull");
        }
        else{
            System.out.println("DOB Validation Failed");
        }

        driver.quit();


    }
}
