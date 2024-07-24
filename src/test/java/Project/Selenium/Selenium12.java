package Project.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium12 {

    @Test
    @Description("Verify the login functionality")

    public void VwoLogin12(){


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        //WebElement anchot_tag = driver.findElement(By.linkText("Start a free trial"));
        WebElement anchot_tag = driver.findElement(By.partialLinkText("Start a free"));
        System.out.println(anchot_tag.getAttribute("href"));
        anchot_tag.click();






    }
}
