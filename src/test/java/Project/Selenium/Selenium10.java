package Project.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium10 {
    @Test
    @Description("Verify the current url and title of Visascentral.com")

    public void NewTC() throws InterruptedException {
        // open visascentral.com
        // print the title and get urrent url
        // verifi the current url is visascentral.con

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://visascentral.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(5000);

        Assert.assertEquals(driver.getTitle(),"Visa Central – Visas");
        Assert.assertEquals(driver.getCurrentUrl(),"https://visascentral.com/");
    }
}
