package Project.PraticeTestCase;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addToCart {
        @Test
        @Description("End to End Test Case INtregation")

        public void AddtoCart() throws InterruptedException {

            ChromeDriver driver = new ChromeDriver();
            driver.get("https://magento.softwaretestingboard.com/");
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            Thread.sleep(3000);

            WebElement shopTees = driver.findElement(By.xpath("//*[@id=\"maincontent\"]"));
            shopTees.click();

            WebElement RadientTee = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/div/strong/a"));
            RadientTee.click();
            Thread.sleep(2000);

            WebElement Sizebtn = driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-170\"]"));
            Sizebtn.click();

            WebElement colour = driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-57\"]"));
            colour.click();

            WebElement AddButn = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span"));
            AddButn.click();


        }
    }

