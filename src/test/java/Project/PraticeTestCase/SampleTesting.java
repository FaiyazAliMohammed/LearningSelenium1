package Project.PraticeTestCase;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class SampleTesting {
    ChromeDriver driver;

    @BeforeTest
    public void OpenBrowser(){

        ChromeOptions  options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();


    }
    @Test
    @Description("automate all the components")

    public void TC01() throws InterruptedException {
        driver.get("https://artoftesting.com/samplesiteforselenium");
        System.out.println(driver.getTitle());

        WebElement link = driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]"));
        link.click();

        WebElement Textbox = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
        Textbox.sendKeys("Yaba");

        WebElement RadioBtn = driver.findElement(By.xpath("//*[@id=\"male\"]"));
        RadioBtn.click();

        WebElement CheckBox = driver.findElement(By.xpath("//*[@class=\"Automation\"]"));
        CheckBox.click();

        WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"testingDropdown\"]"));
        Select Manual = new Select(Dropdown);
        Manual.selectByVisibleText("Manual Testing");

        WebElement AlertBox = driver.findElement(By.xpath("//*[@id=\"AlertBox\"]"));
        AlertBox.click();
        Thread.sleep(2000);








    }


}
