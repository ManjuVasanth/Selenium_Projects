package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLinkDemo {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user" + Keys.TAB);
        driver.findElement(By.id("password")).sendKeys("secret_sauce" + Keys.TAB);
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Hello"+Keys.TAB);
        driver.findElement(By.id("last-name")).sendKeys("World"+Keys.TAB);
        driver.findElement(By.id("postal-code")).sendKeys("12345"+Keys.TAB);
        driver.findElement(By.id("continue")).click();
        //driver.quit();
    }
}
