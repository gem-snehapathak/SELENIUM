package assignment2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WebTables {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/sneha.pathak/Downloads/Assignment.html");



                WebElement table = driver.findElement(By.xpath("/html/body/table"));
                List<WebElement> rows = table.findElements(By.tagName("tr"));

                Set<String> uniqueRows = new HashSet<>();


                for (WebElement row : rows) {
                    List<WebElement> cells = row.findElements(By.tagName("td"));
                    StringBuilder rowData = new StringBuilder();
                    for (WebElement cell : cells) {
                        rowData.append(cell.getText()).append(",");
                    }
                    uniqueRows.add(rowData.toString());
                }


                for (String row : uniqueRows) {
                    System.out.println(row);
                }


//                driver.quit();
            }
        }



