package Project.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium18 {

    ChromeDriver driver;
    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    @Description("Check login Functionality")
    public void TestCasePositive(){
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }

}
