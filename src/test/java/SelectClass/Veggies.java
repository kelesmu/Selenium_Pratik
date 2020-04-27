package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Veggies {


    @Test
    public void brocolli() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String [] itemsNeeded = {"Brocolli","Cucumber","Potato"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i=0; i<products.size(); i++)
        {

           String[] name=products.get(i).getText().split("-");
           String formattedName = name[0].trim();


           List itemNeededList = Arrays.asList(itemsNeeded);
          int j=0;
           if(itemNeededList.contains(formattedName))
           {
               j++;
               driver.findElements(By.cssSelector("div.product-action")).get(i).click();
               //Thread.sleep(5000);
               if (j==3)
                   break;

            }

        }

    }
}