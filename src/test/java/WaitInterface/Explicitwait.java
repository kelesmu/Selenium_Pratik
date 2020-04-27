package WaitInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicitwait {

@Test
    public void eWait() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
        WebDriverWait eWait=new WebDriverWait(driver,10);
      String text=  eWait.until(ExpectedConditions.visibilityOfElementLocated
              (By.xpath("//div[contains(text(),'Process completed!')]"))).getText();
        System.out.println(text);
        System.Out.println(text);
          


    }
}
