package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClearTrip {
    @Test
    public void clearTrip() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");

        driver.findElement(By.id("OneWay")).click();
        driver.findElement(By.id("DepartDate")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();


        Select adultNumberElm = new Select(driver.findElement(By.name("adults")));
        adultNumberElm.selectByVisibleText("3");

        Select childNumberElm = new Select(driver.findElement(By.id("Childrens")));
        childNumberElm.selectByVisibleText("2");
        Thread.sleep(2000);
        driver.findElement(By.id("MoreOptionsLink")).click();
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Turkish Airlines (TK)");
        driver.findElement(By.cssSelector("#SearchBtn")).click();

       String message =  driver.findElement(By.id("homeErrorMessage")).getText();
        System.out.println(message);
        Assert.assertEquals(message, "Sorry, but we can't continue until you fix everything that's marked in RED",
                "message is not matched");







    }

}
