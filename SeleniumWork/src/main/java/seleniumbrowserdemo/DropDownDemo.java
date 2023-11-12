package seleniumbrowserdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args){

        System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url = "https://www.leafground.com/select.xhtml;jsessionid=node01mhc4shs472mbd6xseyr7p1az538079.node0";
        driver.get(url);
        WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
        dropDown1.sendKeys("Playwright");
        Select select1 = new Select(dropDown1);
        select1.selectByIndex(3);

        select1.selectByVisibleText("Selenium");
       List<WebElement> listOfOptions = select1.getOptions();
       int size = listOfOptions.size();
        System.out.println("Number of options:"+ size);
        WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/ul"));
        Select multiSelectBox = new Select(multiselect);
        multiSelectBox.selectByIndex(2);


    }
}
