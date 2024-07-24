package Project.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.awt.SystemColor.text;


public class Selenium21 {

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
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("King@123");
        driver.findElement(By.xpath("//*[@id=\"js-login-btn\"]")).click();

        //Explecit wait
        WebElement Error_Msg = driver.findElement(By.xpath("//*[@id=\"js-notification-box-msg\"]"));

        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.textToBePresentInElement(Error_Msg,"Your email, password, IP address or location did not match"));

        System.out.println("1 ---->" + Error_Msg);



        // Waits

       //WAITS


         





        }


    }


