package assignment;
import locators.LocatorDissapearing;
import org.openqa.selenium.By;
import utilityClass.Driver;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class DissapearingElements {
    public static void main(String[] args)  {
        try {
            Driver.setup("https://id.wisepops.com/login");
            webElement(LocatorDissapearing.Button).click();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
