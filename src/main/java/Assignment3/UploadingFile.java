package Assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallseotools.com/plagiarism-checker/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"fileUpload\"]")).sendKeys("C:\\Users\\sneha.pathak\\Documents\\GIT Assignment 2.docx");
    }
}
