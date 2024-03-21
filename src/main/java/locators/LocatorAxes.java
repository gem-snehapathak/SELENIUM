package locators;

public class LocatorAxes {
    public static String First = "//ul[@id='homefeatured']/li[1]//h5/a";

    public static String Parent = "//h1[text()='Automation Practice Website']";

    public static String Second = "//ul[@id='homefeatured']/li[1]/following-sibling::li[1]//h5/a" ;

    public static String Third = "//ul[@id='homefeatured']/li[3]/preceding-sibling::li[1]//h5/a";

    public static String Ancestor = "//ul[@id='homefeatured']/li[1]//h5/a/ancestor::li[1]";

    public static String Descendant= "//ul[@id='homefeatured']//li[1]//h5/a/descendant::span[@class='price product-price']";
}
