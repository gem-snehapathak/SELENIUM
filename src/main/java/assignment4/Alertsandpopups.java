package assignment4;


import locators.LocatorAlerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilityClass.Driver;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class Alertsandpopups  {
    public static void main(String[] args)  {
        try {
            Driver.setup("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//        2.
            webElement(LocatorAlerts.AlertBox).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
//        3.
            webElement(LocatorAlerts.ConformationBox).click();
            String text = driver.switchTo().alert().getText();
            System.out.println(text);
            driver.switchTo().alert().dismiss();
            Thread.sleep(1000);
//        4.
            webElement(LocatorAlerts.PromptBox).click();
            Alert promptBox = driver.switchTo().alert();
            promptBox.sendKeys("Snehaaa");
            Thread.sleep(2000);
            promptBox.accept();
            Thread.sleep(1000);
//        5.
            WebElement bttn = driver.findElement(By.id(LocatorAlerts.Button));
            Actions action = new Actions(driver);
            action.doubleClick(bttn).build().perform();
            String text1 = driver.switchTo().alert().getText();
            System.out.println(text1);
            driver.switchTo().alert().dismiss();
//        6.
            WebElement hover = webElement(LocatorAlerts.Hover);
            Actions action1 = new Actions(driver);
            action1.moveToElement(hover).build().perform();
            Thread.sleep(2000);
            driver.findElement(By.id(LocatorAlerts.Link)).click();
            Thread.sleep(2000);

            driver.quit();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        }
    }


