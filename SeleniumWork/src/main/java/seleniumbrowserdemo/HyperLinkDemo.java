package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HyperLinkDemo {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/link.xhtml");
        // go to dashboard
        WebElement goToDashbd = driver.findElement(By.linkText("Go to Dashboard"));
        goToDashbd.click();
        driver.navigate().back();
        // to find URL without clicking
        WebElement urlWithoutClick = driver.findElement(By.partialLinkText("Find the URL"));
        String where = urlWithoutClick.getAttribute("href");
        System.out.println("Link is going to open "+ where);
// To find Link is broken
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();
        String title = driver.getTitle();
        if(title.contains("404")){
            System.out.println("Broken Link");
        }
        driver.navigate().back();
        // duplicate Link
        WebElement goToDashbd1 = driver.findElement(By.linkText("Go to Dashboard"));
        goToDashbd1.click();
        // go back to homepage with help of navigate()
        driver.navigate().back();
// find how many links in page
       List<WebElement> totalLinks =  driver.findElements(By.tagName("a"));
        System.out.println(totalLinks.size());
       /*
        List<WebElement> totalLinksInLayout = driver.findElements(By.tagName("a"));
        System.out.println(totalLinksInLayout.size());
*/



    }
}
