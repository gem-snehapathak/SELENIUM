package Assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvents {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.xpath("//div/input[@aria-label='First name']"));
        Actions action = new Actions(driver);
        action.moveToElement(firstname)
                .click().keyDown(Keys.SHIFT).sendKeys("sneha").keyUp(Keys.SHIFT).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        Thread.sleep(2000);
        WebElement lastname = driver.findElement(By.xpath("//div/input[@aria-label='Surname']"));
        action.moveToElement(lastname)
                .click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

                Thread.sleep(2000);

        WebElement mobilenumber = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
        action.moveToElement(mobilenumber)
                .click().sendKeys("7300350013").build().perform();

        Thread.sleep(2000);

        WebElement newPassword = driver.findElement(By.xpath("//input[@data-type='password']"));
        action.moveToElement(newPassword)
                .contextClick().build().perform();

        Thread.sleep(2000);


        driver.quit();




    }
}
