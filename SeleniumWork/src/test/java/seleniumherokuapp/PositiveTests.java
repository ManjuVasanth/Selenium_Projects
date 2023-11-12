package seleniumherokuapp;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests {

    @Test
    public void loginTest() throws InterruptedException {

        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith"+Keys.TAB);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!"+Keys.TAB);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
        loginButton.click();
        String expectedUrl = "https://the-internet.herokuapp.com/secure";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Actual url is not as expected");
        WebElement logOutButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        //Assert.assertTrue(logOutButton.isDisplayed(),"LogOut button is not visible");
        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        String expectedMessage = " You logged into a secure area!";
        String actualMessage = successMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage),"Actual message is not same as expected");
        driver.quit();


    }
}

