package seleniumbrowserdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.leafground.com/alert.xhtml";
        driver.get(url);
        WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
        alertBox.click();
        Alert alertmsg = driver.switchTo().alert();
        alertmsg.accept();
        boolean result = driver.findElement(By.id("simple_result")).getText().equals("You have successfully clicked an alert");
        System.out.println(result);
    }
}
