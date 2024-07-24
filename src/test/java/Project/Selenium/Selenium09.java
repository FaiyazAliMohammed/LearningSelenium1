package Project.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium09 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://bing.com");
        driver.navigate().to("https://visascentral.com");

        driver.navigate().back();
        driver.navigate().forward();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}


