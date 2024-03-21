package assignment2;

import locators.LocatorWebtables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilityClass.Driver;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class WebTables {
    public static void main(String[] args) {
       try {
           Driver.setup("file:///C:/Users/sneha.pathak/Downloads/Assignment.html");
           WebElement table = webElement(LocatorWebtables.table);
           List<WebElement> rows = table.findElements(By.tagName("tr"));

           Set<String> uniqueRows = new HashSet<>();

           for (WebElement row : rows) {
               List<WebElement> cells = row.findElements(By.tagName(LocatorWebtables.colData));
               StringBuilder rowData = new StringBuilder();
               for (WebElement cell : cells) {
                   rowData.append(cell.getText()).append(",");
               }
               uniqueRows.add(rowData.toString());
           }
           for (String row : uniqueRows) {
               System.out.println(row);
           }
       }catch (Exception e){
           System.out.println(e);
       }


            }
        }



