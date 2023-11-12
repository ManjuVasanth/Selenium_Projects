package seleniumherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTests {
    @Test(priority = 1,groups = { "negativeTests", "smokeTests" })
    public void inCorrectUserNameTest() throws InterruptedException {

        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("inCorrectUserName ");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
        loginButton.click();
       //Verifications
        WebElement errorMessage = driver.findElement(By.id("flash"));
        String expectedErrorMessage = "Your username is invalid!";
        String actualErrorMessage = errorMessage.getText();
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),"Actual Error message is not expected");
        driver.quit();


    }
    @Test(priority = 2,groups = { "negativeTests"})
    public void inCorrectPasswordTest() throws InterruptedException {

        System.setProperty("weddriver.chrome.driver","D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Incorrect Password!");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
        loginButton.click();
        //Verifications
        WebElement errorMessage = driver.findElement(By.id("flash"));
        String expectedErrorMessage = "Your password is invalid!";
        String actualErrorMessage = errorMessage.getText();
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),"Actual Error message is not expected");
        driver.quit();


    }
}

