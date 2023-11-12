package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
        WebElement basic = driver.findElement(By.id("j_idt87:j_idt89_input"));
        boolean selection = basic.isSelected();
        System.out.println(selection);
        driver.navigate().back();

        WebElement java = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/label"));
        if(java.isSelected()){
            java.click();
        }
        WebElement python = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
        if(python.isSelected()){
            python.click();
        }





    }
}
