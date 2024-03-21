package assignment6;

import locators.LocatorIframe;
import org.openqa.selenium.WebElement;
import utilityClass.Driver;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class iFrames  {
    public static void main(String[] args)  {

        try {
            Driver.setup("http://demo.automationtesting.in/Frames.html");
            webElement(LocatorIframe.Iframe).click();
            WebElement frame = webElement(LocatorIframe.MultipleIframe);
            driver.switchTo().frame(frame);
            WebElement frame1 = webElement(LocatorIframe.Frame1);
            driver.switchTo().frame(frame1);
            webElement(LocatorIframe.InputBox).sendKeys("sneha");
            Thread.sleep(2000);
            driver.switchTo().parentFrame();
            driver.switchTo().parentFrame();
            webElement(LocatorIframe.Button).click();
            WebElement frame2 = webElement(LocatorIframe.Frame2);
            driver.switchTo().frame(frame2);
            webElement(LocatorIframe.InputBox2).sendKeys("akshit");

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}