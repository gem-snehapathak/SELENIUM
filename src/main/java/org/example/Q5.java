package org.example;//1. XPath Axes navigate through elements in the XML structure of a webpage. They allow you to locate elements
//   based on their relationship with other elements, like parent, sibling, child, ancestor, or descendant.
//2. XPath axes methods are crucial when creating XPaths, especially in scenarios where the structure of the XML or
//   HTML document is complex, and elements have specific relationships with each other. Axes methods in XPath provide
//   a way to navigate through the hierarchical structure of the document, allowing you to target elements based
//   on their position, relationships, and attributes in a more flexible and precise mann

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("http://automationpractice.com");

        // Example 1: Selecting child elements
        WebElement firstProductName = driver.findElement(By.xpath("//ul[@id='homefeatured']/li[1]//h5/a"));
        System.out.println("First Product Name: " + firstProductName.getText());

        // Example 2: Selecting parent element
        WebElement parentElement = driver.findElement(By.xpath("//h1[text()='Automation Practice Website']"));
        System.out.println("Parent Element: " + parentElement.getTagName());

        // Example 3: Selecting following sibling
        WebElement secondProductName = driver.findElement(By.xpath("//ul[@id='homefeatured']/li[1]/following-sibling::li[1]//h5/a"));
        System.out.println("Second Product Name: " + secondProductName.getText());

        // Example 4: Selecting preceding sibling
        WebElement thirdProductName = driver.findElement(By.xpath("//ul[@id='homefeatured']/li[3]/preceding-sibling::li[1]//h5/a"));
        System.out.println("Third Product Name: " + thirdProductName.getText());

        // Example 5: Selecting ancestor
        WebElement ancestorElement = driver.findElement(By.xpath("//ul[@id='homefeatured']/li[1]//h5/a/ancestor::li[1]"));
        System.out.println("Ancestor Element: " + ancestorElement.getTagName());

        // Example 6: Selecting descendant
        WebElement descendantElement = driver.findElement(By.xpath("//ul[@id='homefeatured']//li[1]//h5/a/descendant::span[@class='price product-price']"));
        System.out.println("Descendant Element: " + descendantElement.getText());

        Thread.sleep(2000);


        driver.quit();
    }
}



