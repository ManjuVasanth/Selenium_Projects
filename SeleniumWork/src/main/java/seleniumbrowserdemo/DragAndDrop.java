package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml");
        WebElement to = driver.findElement(By.id("form:drop_header"));
        WebElement from = driver.findElement(By.id("form:drag_content"));
        Actions actions = new Actions(driver);
        //actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
        actions.dragAndDrop(from,to).build().perform();
    }
}
