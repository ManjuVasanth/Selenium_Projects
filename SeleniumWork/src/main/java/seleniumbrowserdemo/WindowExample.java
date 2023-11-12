package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowExample {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0yo6qzu9xqwl31cco5hetlcrta543793.node0");
        // to identify parent window
       String oldWindow = driver.getWindowHandle();

        WebElement firstButton = driver.findElement(By.id("j_idt88:new"));
        firstButton.click();
        // contains new & old window
        Set<String> handles = driver.getWindowHandles();
// control goes to new window
        for (String newWindows:handles) {
            driver.switchTo().window(newWindows);
        }
        driver.close();
        driver.switchTo().window(oldWindow);
        WebElement openMultipleWindow = driver.findElement(By.id("j_idt88:j_idt91"));
        openMultipleWindow.click();
        int numOfWindows = driver.getWindowHandles().size();
        System.out.println("Number of Windows open: "+numOfWindows);
// close Windows except Primary
        WebElement closeBtn = driver.findElement(By.id("j_idt88:j_idt93"));
        closeBtn.click();
        Set<String> newMulipleWindows = driver.getWindowHandles();
        for (String allWindows:newMulipleWindows) {
            if(!allWindows.equals(oldWindow)){
                driver.switchTo().window(allWindows);
                driver.close();
            }

        }



    }
}
