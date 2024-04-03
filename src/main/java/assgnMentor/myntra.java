package assgnMentor;

import locators.LocatorMyntra;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilityClass.Driver;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static utilityClass.Driver.driver;
import static utilityClass.Driver.webElement;

public class myntra {
    public static void main(String[] args) {
        try {
            Driver.setup("https://www.myntra.com/");
            webElement(LocatorMyntra.TextBox).sendKeys("Dresses for Women");
            webElement(LocatorMyntra.SearchIcon).click();
            webElement(LocatorMyntra.Brand);
            webElement(LocatorMyntra.ArticleName);
            webElement(LocatorMyntra.Price);

            HashMap<String, List<HashMap<String, String> >> hashMap=new HashMap<>();
            List<WebElement> brandNames= new ArrayList<>(driver.findElements(By.xpath(LocatorMyntra.Brand)));
            List<WebElement> articles= new ArrayList<>(driver.findElements(By.xpath(LocatorMyntra.ArticleName)));
            List<WebElement> prices= new ArrayList<>(driver.findElements(By.xpath(LocatorMyntra.Price)));

            int indprice = 0;
            for(int index=0;index<brandNames.size();index++){
                if(!brandNames.get(index).getText().equals("")){
                    String brand = brandNames.get(index).getText();
                    String articleName = articles.get(index).getText();
                    String price = "";
                    if(indprice < 46)
                        price = prices.get(indprice++).getText();

                    HashMap<String, String>desc = new HashMap<>();
                    desc.put("ArticleName", articleName);
                    desc.put("Price", price);

                    if (!hashMap.containsKey(brand)) {
                        hashMap.put(brand, new ArrayList<>());

                    }
                    hashMap.get(brand).add(desc);

                }
            }
            JSONObject jsonObject=new JSONObject(hashMap);
            FileWriter file=new FileWriter("src/main/resources/TestData.json");
            file.append(jsonObject.toJSONString());
            file.close();

        }catch (Exception e){
            System.out.println(e);
        }
        }
}
