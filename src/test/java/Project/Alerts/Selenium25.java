package Project.Alerts;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class Selenium25 {

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
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //WebElement element = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        //element.click();

        //WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        //elementConfirm.click();
        WebElement elementPromt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        elementPromt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());


        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hasan");
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        //Assert.assertEquals(result,"You successfully clicked an alert") ;
        //Assert.assertEquals(result, "You clicked: Ok");
        Assert.assertEquals(result, "You entered: Hasan");



         





        }


    }


