package Project.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium14 {

    @Test
    @Description("Get the title")

    public void GetTitle(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
    }
}
