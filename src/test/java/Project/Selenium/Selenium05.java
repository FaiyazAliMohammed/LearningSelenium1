package Project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium05 {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("---Start-maximized");
        chromeOptions.addArguments("--800,600");
        chromeOptions.addArguments("--incoginito");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wwe.com/");
        System.out.println(driver.getTitle());

        //driver.manage().window().fullscreen();
        //driver.quit();

    }
}
