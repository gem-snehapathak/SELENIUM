package assgnMentor;

import locators.LocatorMyntra;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilityClass.Driver;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class myntra {
    public static void main(String[] args) {
        try {
            Driver.setup("https://www.myntra.com/");
            webElement(LocatorMyntra.TextBox).sendKeys("Dresses for Women");
            webElement(LocatorMyntra.SearchIcon).click();
            By brand=By.xpath("//ul[@class='results-base']//div/h3");
            By articleName=By.xpath("//*[@id='desktopSearchResults']//h4[@class='product-product']");
            By price=By.xpath("//ul[@class='results-base']//div/span/span[@class='product-discountedPrice']");



            Map<String, List<String>> hashMap=new HashMap<>();
            List<WebElement> brandNames=driver.findElements(brand);
//            List<WebElement> articles=driver.findElements(articleName);
            List<WebElement> prices=driver.findElements(price);



            for(int index=0;index<prices.size();index++){
                if(!brandNames.get(index).getText().equals("")){
                    List<String> priceList=hashMap.getOrDefault(brandNames.get(index).getText(),new ArrayList<>());
                    priceList.add(prices.get(index).getText());
                    hashMap.put(brandNames.get(index).getText(),priceList);
                }
            }
//            driver.findElement(By.xpath("//a[@rel='next']")).click();

            JSONObject jsonObject=new JSONObject(hashMap);
            FileWriter file=new FileWriter("src/main/resources/TestData.json");
            file.append(jsonObject.toJSONString());
            file.close();

        }catch (Exception e){
            System.out.println(e);
        }
        }



}
