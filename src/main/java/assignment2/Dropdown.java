package assignment2;

import locators.LocatorDropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilityClass.Driver;
import static utilityClass.Driver.driver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        try {
            Driver.setup("file:///C:/Users/sneha.pathak/Downloads/Dropdown.html");
            Thread.sleep(1000);

            WebElement ddDay = driver.findElement(By.name(LocatorDropdown.day));
            ddDay .click();
            Select date = new Select(ddDay );
            date.selectByValue("05");
            Thread.sleep(1000);

            WebElement ddMonth = driver.findElement(By.id(LocatorDropdown.month));
            ddMonth.click();
            Select month = new Select(ddMonth);
            month.selectByValue("05");
            Thread.sleep(1000);

            WebElement ddYear = driver.findElement(By.name(LocatorDropdown.year));
            ddYear.click();
            Select year = new Select(ddYear);
            year.selectByValue("2005");

            String dob = date.getFirstSelectedOption().getText();
            dob = dob + "-" + month.getFirstSelectedOption().getText();
            dob = dob + "-" + year.getFirstSelectedOption().getText();

            if (dob.equals("05-May-2005")) {
                System.out.println("DOB Validation Successfull");
            } else {
                System.out.println("DOB Validation Failed");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
