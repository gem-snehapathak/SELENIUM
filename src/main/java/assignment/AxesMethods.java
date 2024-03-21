package assignment;//1. XPath Axes navigate through elements in the XML structure of a webpage. They allow you to locate elements
//   based on their relationship with other elements, like parent, sibling, child, ancestor, or descendant.
//2. XPath axes methods are crucial when creating XPaths, especially in scenarios where the structure of the XML or
//   HTML document is complex, and elements have specific relationships with each other. Axes methods in XPath provide
//   a way to navigate through the hierarchical structure of the document, allowing you to target elements based
//   on their position, relationships, and attributes in a more flexible and precise mann

import locators.LocatorAxes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilityClass.Driver;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class AxesMethods {

    public static void main(String[] args)  {
        try {
            Driver.setup("http://automationpractice.com");
            // Example 1: Selecting child elements
            WebElement firstProductName = webElement(LocatorAxes.First);
            System.out.println("First Product Name: " + firstProductName.getText());

            // Example 2: Selecting parent element
            WebElement parentElement = webElement(LocatorAxes.Parent);
            System.out.println("Parent Element: " + parentElement.getTagName());

            // Example 3: Selecting following sibling
            WebElement secondProductName = webElement(LocatorAxes.Second);
            System.out.println("Second Product Name: " + secondProductName.getText());

            // Example 4: Selecting preceding sibling
            WebElement thirdProductName = webElement(LocatorAxes.Third);
            System.out.println("Third Product Name: " + thirdProductName.getText());

            // Example 5: Selecting ancestor
            WebElement ancestorElement = webElement(LocatorAxes.Ancestor);
            System.out.println("Ancestor Element: " + ancestorElement.getTagName());

            // Example 6: Selecting descendant
            WebElement descendantElement = webElement(LocatorAxes.Descendant);
            System.out.println("Descendant Element: " + descendantElement.getText());



        }catch (Exception e){
            System.out.println(e);
        }
    }
}



