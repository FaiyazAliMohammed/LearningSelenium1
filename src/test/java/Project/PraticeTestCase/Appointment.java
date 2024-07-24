package Project.PraticeTestCase;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Appointment {

    @Test
    @Description("MAke an appointment")

    public void MakeAnAppointment() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        String welcomeMsg = driver.findElement(By.xpath("//*[@id=\"top\"]/div/h1")).getText();


        Assert.assertEquals(welcomeMsg,"CURA Healthcare Service");

        WebElement AppointmentButton = driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]"));
        AppointmentButton.click();

        WebElement UserName = driver.findElement(By.xpath("//*[@id=\"txt-username\"]"));
        UserName.sendKeys("John Doe");

        WebElement Password = driver.findElement(By.xpath("//*[@id=\"txt-password\"]"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"btn-login\"]"));
        LoginBtn.click();

        Thread.sleep(3000);

        WebElement dropdoen = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]"));
        Select seoul = new Select(dropdoen);
        seoul.selectByVisibleText("Seoul CURA Healthcare Center");

        WebElement tickbox = driver.findElement(By.xpath("//*[@id=\"chk_hospotal_readmission\"]"));
        tickbox.click();

        WebElement radiobutn = driver.findElement(By.xpath("//*[@id=\"radio_program_none\"]"));
        radiobutn.click();

        WebElement date = driver.findElement(By.xpath("//*[@id=\"txt_visit_date\"]"));
        date.sendKeys("15/07.2024");

        WebElement Comments = driver.findElement(By.xpath("//*[@id=\"txt_comment\"]"));
        Comments.sendKeys("Looking for Medical Appointment ");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]"));
        button.click();

        String confirmationDate = driver.findElement(By.xpath("//*[@id=\"visit_date\"]")).getText();

        Assert.assertEquals(confirmationDate,"15/07/2024");







    }

}
