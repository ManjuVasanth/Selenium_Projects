package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FrameDemo {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
        driver.switchTo().frame(0);
        WebElement button1 = driver.findElement(By.id("Click"));
        button1.click();
        String text = driver.findElement(By.id("Click")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();

        driver.switchTo().frame(2);
        driver.switchTo().frame("frame2");
        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"Click\"]"));
        button2.click();
        driver.switchTo().defaultContent();
        List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
        int size = totalFrames.size();
        System.out.println(size);


    }
}
