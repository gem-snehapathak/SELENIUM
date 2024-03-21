package assignment;

import locators.LocatorSvg;
import org.openqa.selenium.By;
import utilityClass.Driver;

import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class SvgElements {
    public static void main(String[] args)  {
      try {
          Driver.setup("https://www.tricentis.com/");
          webElement(LocatorSvg.SvgElement).click();

      }catch (Exception e){
          System.out.println(e);
      }
    }

}
