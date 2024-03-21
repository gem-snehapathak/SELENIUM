package Assignment3;

import locators.LocKeyboardEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilityClass.Driver;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class KeyboardEvents {
    public static void main(String[] args)  {
        try {
            Driver.setup("https://www.facebook.com/reg/");
            WebElement firstName = webElement(LocKeyboardEvents.FirstName);
            Actions action = new Actions(driver);
            action.moveToElement(firstName)
                    .click().keyDown(Keys.SHIFT).sendKeys("sneha").keyUp(Keys.SHIFT).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

            Thread.sleep(2000);
            WebElement lastName = webElement(LocKeyboardEvents.SurName);
            action.moveToElement(lastName)
                    .click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

            Thread.sleep(2000);

            WebElement mobileNumber = webElement(LocKeyboardEvents.MobileNumber);
            action.moveToElement(mobileNumber)
                    .click().sendKeys("7300350013").build().perform();

            Thread.sleep(2000);

            WebElement newPassword = webElement(LocKeyboardEvents.Password);
            action.moveToElement(newPassword)
                    .contextClick().build().perform();

            Thread.sleep(2000);


        }
        catch(Exception e){
            System.out.println(e);
        }




    }
}
