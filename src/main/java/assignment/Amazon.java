package assignment;

import locators.LocatorAmazon;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilityClass.Driver;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;


public class Amazon {

    public static void main(String[] args)  {
       try {
           Driver.setup("https://www.amazon.in");
           webElement(LocatorAmazon.TextBox).sendKeys("Books");
           webElement(LocatorAmazon.SearchBtn).click();

           WebElement firstResult = webElement(LocatorAmazon.Result);

           if (firstResult.isDisplayed()) {

               String bookName = firstResult.getText();
               System.out.println("First book in search results: " + bookName);
           } else {
               System.out.println("Searched item not found.");
           }
           boolean isElementDisplayed = webElement(LocatorAmazon.Book).isDisplayed();
           Asserts.check(isElementDisplayed, "BOOK displayed");
           if (isElementDisplayed) {
               System.out.println("yes");
           } else {
               System.out.println("no");
           }
       }catch (Exception e){
           System.out.println(e);
       }


    }
}


