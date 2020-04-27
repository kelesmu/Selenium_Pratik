package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Xpath {



    @Test
    public void xpathParent () {


        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.spicejet.com/default.aspx");
        driver.findElement(By.xpath("//div[@id='travelOptions'] //input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).clear();
        driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("del");
        driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.linkText(" Delhi (DEL)")).click();
        driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("kan");
        driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys(Keys.ARROW_RIGHT);

        driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last'] //a[text()='10']")).click();


    }
}
