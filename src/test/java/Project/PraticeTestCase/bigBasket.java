package Project.PraticeTestCase;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bigBasket {

    ChromeDriver driver;
    @BeforeTest
    public void OpenBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();

    }


    @Description("Check milk titles on big basket")
    public void Milktitles(){
        driver.get("https://www.bigbasket.com/?nc=logo");
        driver.manage().window().maximize();





    }

}
