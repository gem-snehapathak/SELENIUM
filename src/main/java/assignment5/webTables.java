package assignment5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class webTables {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='customers']/tbody/tr"));

        List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
        System.out.println(rowelements.size());
        int rowsize = rowelements.size();

        List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
        System.out.println(columnelements.size());
        int colsize = columnelements.size();

        for(int i=1;i<rowsize;i++){
            for(int j=1;j<=colsize;j++){
                System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+ (i+1) +"]/td["+ j +"]")).getText());
            }
            System.out.println();
        }

        driver.quit();


    }
}
