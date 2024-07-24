package Project.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium11 {
    @Test
    @Description("Verify the current url and title of vwo.com")

    public void VwoLogin() throws InterruptedException {
        // open visascentral.com
        // print the title and get urrent url
        // verifi the current url is visascentral.con

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(5000);

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");




        WebElement emailtextbox = driver.findElement(By.id("login-username"));
        emailtextbox.sendKeys("admin@admin.com");

        driver.findElement(By.name("password")).sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();

        Thread.sleep(3000);

        WebElement errorMsg = driver.findElement(By.className("notification-box-description"));
        String errorMSgText = errorMsg.getText();

        Assert.assertEquals(errorMSgText,"Your email, password, IP address or location did not match");



        //WebElement passwordtextbox = driver.findElement(By.id("login-password"));
        //passwordtextbox.sendKeys("admin");

        driver.findElement(By.name("password")).sendKeys("admin");




    }
}

