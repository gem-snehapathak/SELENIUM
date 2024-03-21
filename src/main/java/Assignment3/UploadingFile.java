package Assignment3;

import locators.LocatorUploading;
import utilityClass.Driver;
import static utilityClass.Driver.webElement;

public class UploadingFile {
    public static void main(String[] args) {
        Driver.setup("https://smallseotools.com/plagiarism-checker/");
        webElement(LocatorUploading.Upload)
                .sendKeys("C:\\Users\\sneha.pathak\\Documents\\GIT Assignment 2.docx");
    }
}
