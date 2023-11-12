package com.herokuapp.internet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static javax.swing.UIManager.get;

public class ExceptionsTests {

    @Test
    public void noSuchElementExceptionTest() throws InterruptedException {
        String url = "https://practicetestautomation.com/practice-test-exceptions/";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement addBtn = driver.findElement(By.id("add_btn"));
        addBtn.click();
        //Thread.sleep(10000);
        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement row2Input =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"row2\"]/input")));
        //WebElement row2Input = driver.findElement(By.xpath("//*[@id=\"row2\"]/input"));
       // Assert.assertTrue(row2Input.isDisplayed(),"Row 2 is not displayed");
        row2Input.sendKeys("Donut");
        WebElement saveBtn = driver.findElement(By.xpath("//div[@id='row2']/button[@name = 'Save']"));
        saveBtn.click();

        WebElement confirmText = driver.findElement(By.id("confirmation"));
        String messageText = confirmText.getText();
        String expectedText = "Row 2 was saved";
        Assert.assertEquals(messageText,expectedText,"Confirmation text is not as expected");

        WebElement editBtn = driver.findElement(By.id("edit_btn"));
        editBtn.click();
        WebDriverWait edit = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement row1Input =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"row1\"]/input")));
        row1Input.clear();
        row1Input.sendKeys("Noodles");
        String value = row1Input.getAttribute("value");
        Assert.assertEquals(value,"Noodles");

        driver.quit();



    }
}

