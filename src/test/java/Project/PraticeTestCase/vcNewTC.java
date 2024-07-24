package Project.PraticeTestCase;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class vcNewTC {

    ChromeDriver driver;
    @BeforeTest
    public void VCTC (){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();

    }

    @Test
    @Description("Print the title and post the massage and verify the thank you msg")
    public void VC01() throws InterruptedException {

        driver.get("https://visascentral.com/");
        System.out.println(driver.getTitle());


        WebElement Nmame = driver.findElement(By.xpath("//*[@name=\"fullname\"]"));
        Nmame.sendKeys("Hasan");

        WebElement Email = driver.findElement(By.xpath("//*[@name=\"email-468\"]"));
        Email.sendKeys("Hasan@visascentral.com");

        WebElement Tele = driver.findElement(By.xpath("//*[@name=\"tel-525\"]"));
        Tele.sendKeys("9100555085");

        WebElement MSg = driver.findElement(By.xpath("//*[@name=\"text-948\"]"));
        MSg.sendKeys("Canada PR");

        WebElement Send = driver.findElement(By.xpath("//*[@value=\"Send\"]"));
        Send.click();

        Thread.sleep(3000);

        String thankYou = driver.findElement(By.xpath("//*[@id=\"wpcf7-f24989-p24972-o1\"]/form/div[3]")).getText();

        Assert.assertEquals(thankYou,"Thank you for your message. It has been sent.");


    }


}
