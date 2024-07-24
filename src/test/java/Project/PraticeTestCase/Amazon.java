package Project.PraticeTestCase;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Amazon {

    ChromeDriver driver;

    @BeforeTest
    public void OpenBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();


    }

    @Test
    @Description("Print all the titles")
    public void Snap() throws InterruptedException {
        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();

        WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        SearchBox.sendKeys("Iphones");
        WebElement SearchBtn = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        SearchBtn.click();
        Thread.sleep(3000);

        List<WebElement> SearechedTitles = driver.findElements(By.xpath("//*[@data-cy=\"title-recipe\"]"));
        for (WebElement title : SearechedTitles) {
            System.out.println(title.getText());
        }
    }
}