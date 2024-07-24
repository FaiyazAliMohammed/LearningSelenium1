package Project.Wait;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class Selenium22 {

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
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("Faiyazalimohammed@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Agent@123");
        driver.findElement(By.xpath("//*[@id=\"js-login-btn\"]")).click();

        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10000));

        //Explecit wait


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-qa='lufexuloga']")));
        WebElement Dash_Msg = driver.findElement(By.cssSelector("[data-qa='lufexuloga']"));

        System.out.println("LOgged in user will b printed ---->" + Dash_Msg.getText());



        // Waits

       //WAITS


         





        }


    }


