package Project.Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium06 {

    public static void main(String[] args) {

        //WebDriver driver = new ChromeDriver();
        // WebDriver driver1 = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://visascentral.com");
        System.out.println(driver.getTitle());




    }
}
