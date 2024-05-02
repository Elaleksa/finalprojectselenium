package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProductsListPage extends BasePage{

    By xpathResult = By.xpath("//span[@class='styled__Text-sc-1i711qa-1 xZAYu ddsweb-link__text']");


    public ProductsListPage(WebDriver driver) {
        super(driver);
    }

    public void checkResults(){

        List<WebElement> elements = driver.findElements(xpathResult);
       Assertions.assertFalse(elements.isEmpty());

       elements.forEach(it->{ Assertions.assertEquals("",it.getText());});

    }
}