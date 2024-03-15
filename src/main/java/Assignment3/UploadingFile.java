package Assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/word_to_pdf");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a/span")).sendKeys("C:\\Users\\sneha.pathak\\Documents\\GIT Assignment 1.docx");
        driver.quit();
    }
}
