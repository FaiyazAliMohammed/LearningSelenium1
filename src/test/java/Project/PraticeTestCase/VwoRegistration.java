package Project.PraticeTestCase;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VwoRegistration {

    @Test
    @Description("Verify VWO Registration")

    public void VwoReg() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign");


        WebElement workEmail = driver.findElement(By.xpath("//*[@id=\"page-v1-step1-email\"]"));
        workEmail.sendKeys("Hasan@visascentral.com");

        WebElement ClickButton = driver.findElement(By.xpath("//*[@id=\"page-free-trial-signup-form-step1\"]/div[3]/button"));
        ClickButton.click();

        Thread.sleep(5000);



        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"page-v1-fname\"]"));
        FirstName.sendKeys("Hasan Ali");

        WebElement LastName = driver.findElement(By.xpath("//input[@id=\"page-v1-lname\"]"));
        LastName.sendKeys("Mohammed");





    }
}
