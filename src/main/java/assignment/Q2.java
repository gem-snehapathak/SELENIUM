package assignment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;


public class Q2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Books");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
        sleep(3000);
        WebElement firstResult = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));

        if (firstResult.isDisplayed()) {

            String bookName = firstResult.getText();
            System.out.println("First book in search results: " + bookName);
        } else {
            System.out.println("Searched item not found.");
        }
        boolean isElementDisplayed = driver.findElement(By.xpath("//*[text()='Books' and @class=\"a-size-base a-color-base\"]")).isDisplayed();
        Asserts.check(isElementDisplayed, "BOOK displayed");
        if(isElementDisplayed){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sleep(3000);
        driver.quit();


    }
}


