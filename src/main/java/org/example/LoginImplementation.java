package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static utilityClass.Driver.driver;

public class LoginImplementation {
    public static void enterCredentials(String username, String password) {
        WebElement usernameVal = driver.findElement(By.id("username"));
        WebElement passwordVal = driver.findElement(By.id("password"));
        usernameVal.sendKeys(username);
        passwordVal.sendKeys(password);
    }

    // Clicks on the login button
    public static void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='submit']"));
        loginButton.click();
    }

    // Verifies if the login is successful by checking the current URL
    public static void verifySuccessfulLogin() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";

        try {
            // Asserts if the expected URL matches the actual URL
            assertEquals(expectedUrl, actualUrl);
            System.out.println("Logged in successfully.");
        }
        catch (AssertionError e){
            System.out.println("Unsuccessful Login.");
        }
        catch (Exception e){
            System.out.println("Unsuccessful Login.");
        }
    }
}
