package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class GridTableAssignment {

@Test
    public void gridTable(){

        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement table=driver.findElement(By.cssSelector("table[id='product']"));
        System.out.println("Row number: " + table.findElements(By.tagName("tr")).size());

    int columnCount=table.findElements(By.xpath("//table[@id='product']//tr//th")).size();
    System.out.println("columnNumber: "+ columnCount);

    List<WebElement> thirdrowColumnList =    table.findElements(By.xpath("//table[@id='product']//tr[3]//td"));
    for(int i=0; i<thirdrowColumnList.size();i++){
      String text=  table.findElements(By.xpath("//table[@id='product']//tr[3]//td")).get(i).getText();
        System.out.println(text);
    }





    }
}
