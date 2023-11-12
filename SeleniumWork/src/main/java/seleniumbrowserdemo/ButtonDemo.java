package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class ButtonDemo {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/button.xhtml");
        WebElement clickButton = driver.findElement(By.id("j_idt88:j_idt90"));
        clickButton.click();
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        if(title == "Dashboard"){
            System.out.println("Same title");
        }
        driver.navigate().back();
        //check button is disabled
        WebElement disabledButton = driver.findElement(By.id("j_idt88:j_idt92"));
        boolean status = disabledButton.isEnabled();
        System.out.println("Button status: "+ status);

        //Position of submit button
        WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xyPosition = submitButton.getLocation();
        int xValue = xyPosition.getX();
        int yValue = xyPosition.getY();
        System.out.println("Submit position :" +xyPosition);

        //Button color
        WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt96"));
        String color = buttonColor.getCssValue("background-color");
        System.out.println("Button color: "+color);

        //Height and width of button
        WebElement propertyOfButton = driver.findElement(By.id("j_idt88:j_idt98"));
        int height =propertyOfButton.getSize().getHeight();
        int width =propertyOfButton.getSize().getWidth();
        System.out.println("Height is: "+height+",  "+ "Width is :" +width);

        WebElement colorBtn = driver.findElement(By.id("j_idt88:j_idt100"));
        //Assert.assertEquals("rgb(104, 159, 56)", colorChangeButton.getCssValue("background"));
        String before = colorBtn.getCssValue("background-color");

        Actions act = new Actions(driver);
        act.moveToElement(colorBtn).perform();

        String after = colorBtn.getAttribute("style");
        System.out.println(before + " " + after);

        List<WebElement> countbtns = driver.findElements(By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only rounded-button ui-button-danger mr-2 mb-2"));
        System.out.println(countbtns.size());






    }
}
