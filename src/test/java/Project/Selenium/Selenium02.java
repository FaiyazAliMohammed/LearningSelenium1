package Project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void TestMethd(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wwe.com/");
        driver.quit();
    }
}
