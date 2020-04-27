package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAssignment {

    @Test
    public void assaignment() {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]")).getText());
        driver.switchTo().defaultContent();




    }
}