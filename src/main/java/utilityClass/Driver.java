package utilityClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

        public static WebDriver driver;
        public static void setup(String url) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();

        }
        public static WebElement webElement(String xpath){
            WebElement webElement = driver.findElement(By.xpath(xpath));
            return webElement;

        }



        public void tearDown() {
            // Close the browser
            driver.close();
        }
    }


