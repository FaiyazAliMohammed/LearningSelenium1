package Project.Alerts;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.List;


public class Selenium26 {

    ChromeDriver driver;

    @BeforeTest
    public void OpenBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();


    }

    @Test
    @Description("Print all the titles")
    public void VWO() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //List<WebElement> checkboxex = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        //List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

        List <WebElement> checkboxes = driver.findElements(By.xpath("/input[@type=\\\"checkbox\\\"]\""));
        WebElement ch1 = checkboxes.get(0);
        ch1.click();









         





        }


    }


