package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.amazon.com/";
        driver.get(url);
        driver.findElement(By.id("nav-link-accountList")).click();
        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("superfruitsandvegetables@gmail.com"+ Keys.TAB);
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        WebElement myPassword = driver.findElement(By.id("ap_password"));
        myPassword.sendKeys("october"+Keys.TAB);
        WebElement signIn = driver.findElement(By.id("signInSubmit"));
        signIn.click();
      /*  WebElement notNow = driver.findElement(By.id("ap-account-fixup-phone-skip-link"));
        notNow.click()*/;
        WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"])"+Keys.ENTER));
        WebElement productName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a"));
        productName.click();

        //driver.findElement(By.id("a-page")).sendKeys("dress for girls"+Keys.ENTER);

        driver.findElement(By.linkText("Everyday Essentials")). click();





    }
}
