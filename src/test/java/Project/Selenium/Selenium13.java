package Project.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium13 {

    @Test
    @Description("get all")

    public void VwoLogin13() {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        //Print all the anchor tags on https://app.vwo.com/#/login
        // A TAGS and print the get text

        List<WebElement> all_atags = driver.findElements(By.tagName("a"));
        for (WebElement element:all_atags){

            System.out.println(element.getText());

            // to click the link
            all_atags.get(0).click();
            all_atags.get(1).click();
        }

    }
}
