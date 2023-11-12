package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {
    public static void main(String[] args) {
        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node01jwe6vtosbtbs13gmkqknss54z540054.node0");
        WebElement checkedSafari = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
        WebElement uncheckedFirefox = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/div/div[2]/span"));
        boolean status2 = uncheckedFirefox.isSelected();
        boolean status1 = checkedSafari.isSelected();
        System.out.println(status1);
        System.out.println(status2);
        WebElement below20 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]/span"));
        below20.click();



    }
}
