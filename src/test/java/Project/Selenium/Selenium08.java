package Project.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium08 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.visascentral.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
