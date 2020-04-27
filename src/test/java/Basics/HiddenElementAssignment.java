package Basics;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HiddenElementAssignment {
    @Test
    public void select() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.findElement(By.id("autocomplete")).sendKeys("tur");
        Thread.sleep(2000);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String script = "return document.getElementById(\"autocomplete\").value;";

        String text = (String) js.executeScript(script);
        System.out.println(text);
        int i = 0;
        while (!text.equalsIgnoreCase("TURKEY")) {
            i++;
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

            text = (String) js.executeScript(script);
            System.out.println(text);
            if (i > 4) {
                break;
            }

        }
        if (i > 4) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element  found");
        }

    }
}
