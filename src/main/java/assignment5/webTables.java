package assignment5;

import locators.LocatorTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilityClass.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class webTables {
    public static void main(String[] args) {

        Driver.setup("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> rowelements = (List<WebElement>) webElement(LocatorTables.Rows);
        System.out.println(rowelements.size());
        int rowsize = rowelements.size();

        List<WebElement> columnelements = (List<WebElement>) webElement(LocatorTables.Column);
        System.out.println(columnelements.size());
        int colsize = columnelements.size();

        for(int i=1;i<rowsize;i++){
            for(int j=1;j<=colsize;j++){
                System.out.print(webElement("//*[@id='customers']/tbody/tr["+ (i+1) +"]/td["+ j +"]").getText());
            }
            System.out.println();
        }



    }
}
