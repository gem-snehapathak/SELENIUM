package assignment6;

import locators.LocatorIframe2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilityClass.Driver;
import java.util.List;

import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class Iframes2  {
    public static void main(String[] args)  {

        try {
            Driver.setup("https://chercher.tech/practice/frames");
            WebElement frame = webElement(LocatorIframe2.Frame);
            driver.switchTo().frame(frame);
            WebElement frame1 = webElement(LocatorIframe2.Frame1);
            driver.switchTo().frame(frame1);
            webElement(LocatorIframe2.Button).click();
            driver.switchTo().parentFrame();
            webElement(LocatorIframe2.InputBox).sendKeys("SNEHA");
            driver.switchTo().parentFrame();
            WebElement frame2 = webElement(LocatorIframe2.Frame2);
            driver.switchTo().frame(frame2);
            webElement(LocatorIframe2.Button1).click();
            webElement(LocatorIframe2.Button2).click();
            driver.switchTo().parentFrame();
            driver.switchTo().parentFrame();

            List<WebElement> frames = driver.findElements(By.tagName(LocatorIframe2.Frames));
            System.out.println(frames.size());
        }
        catch (Exception e){
            System.out.println(e);
        }





    }
}
