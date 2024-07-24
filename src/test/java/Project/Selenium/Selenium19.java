package Project.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

import javax.swing.text.html.Option;


public class Selenium19 {

    ChromeDriver driver;

    @BeforeTest
    public void OpenBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver();


    }

    @Test
    @Description("Print all the titles")
    public void Ebay() throws InterruptedException {
        driver.get("https://www.ebay.com/b/Computers-Tablets-Network-Hardware/58058/bn_1865247");
        driver.manage().window().maximize();

        WebElement SearchBox = driver.findElement(By.xpath("//input[@id=\"gh-ac\"]"));
        SearchBox.sendKeys("Macmini");
        WebElement SearchBtn = driver.findElement(By.xpath("//input[@id=\"gh-btn\"]"));
        SearchBtn.click();
        Thread.sleep(3000);

        //List <WebElement> SearchedTitles = (List<WebElement>) driver.findElement(By.xpath("//div[@class=\"s-item__title\"]"));
        List<WebElement> SearchesTitles = driver.findElements(By.xpath("//*[@class=\"s-item__title\"]"));

        int i = 0;

        for (WebElement title: SearchesTitles){
            System.out.println(title.getText());
            if (i == 5){
                title.click();
            }
        }
         





        }


    }


