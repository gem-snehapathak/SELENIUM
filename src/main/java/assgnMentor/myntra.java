package assgnMentor;

import locators.LocatorMyntra;
import utilityClass.Driver;
import static utilityClass.Driver.webElement;

public class myntra {
    public static void main(String[] args) {
        try {
            Driver.setup("https://www.myntra.com/");
            webElement(LocatorMyntra.TextBox).sendKeys("Dresses for Women");
            webElement(LocatorMyntra.SearchIcon).click();

        }catch (Exception e){
            System.out.println(e);
        }
        }



}
