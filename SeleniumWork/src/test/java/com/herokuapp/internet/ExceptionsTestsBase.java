package com.herokuapp.internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ExceptionsTestsBase {
    @BeforeMethod(alwaysRun = true)
    @Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://practicetestautomation.com/practice-test-exceptions/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.quit();

    }
}
