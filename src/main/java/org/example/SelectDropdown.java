package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%7C&placement=&creative=550525804791&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D9298402%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=Cj0KCQjw-r-vBhC-ARIsAGgUO2AuTY8j49evqW-agaxWcc4JDnQh5r8U5b_MfUwtvzLy_nijg70zxywaAlJ0EALw_wcB");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.name("birthday_month"));
        Select select = new Select(dropdown);

        WebElement firstopt = select.getFirstSelectedOption();
        System.out.println(firstopt.getText());


        select.selectByIndex(5);
        Thread.sleep(2000);

        select.selectByValue("8");
        Thread.sleep(2000);

        select.selectByVisibleText("Oct");
        Thread.sleep(2000);

        driver.quit();

    }
}
