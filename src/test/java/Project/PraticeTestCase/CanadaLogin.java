package Project.PraticeTestCase;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CanadaLogin {

    @Test
    @Description("Verifi Candidate Massage is sucessfully delivered")

    public void ContactTestCase (){

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://canada.visascentral.com/");

        WebElement InputName = driver.findElement(By.xpath("//input[@name=\"fullname\"]"));
        InputName.sendKeys("Hasan Ali");

        WebElement InputEmail = driver.findElement(By.xpath("//input[@name=\"email-97\"]"));
        InputEmail.sendKeys("Hasan@gmail.com");

        WebElement TelNo= driver.findElement(By.xpath("//input[@name=\"tel-525\"]"));
        TelNo.sendKeys("9100555085");

        WebElement Massege = driver.findElement(By.xpath("//input[@name=\"text-948\"]"));
        Massege.sendKeys("Looking for Canada PR ");

        WebElement SendButon = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        SendButon.click();

        driver.quit();

    }
}
