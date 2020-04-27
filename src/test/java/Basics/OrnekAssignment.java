package Basics;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrnekAssignment {

    @Test
    public void select() {


        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.findElement(By.id("checkBoxOption1")).click();
        String optionText= driver.findElement(By.xpath("//label[@for='bmw']")).getText();
        System.out.println("CheckBox text is: " + optionText);

       WebElement dropDownBox= driver.findElement(By.id("dropdown-class-example"));
       dropDownBox.click();
        Select slc=new Select(dropDownBox);
        slc.selectByVisibleText(optionText);

        driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(optionText);
        driver.findElement(By.id("alertbtn")).click();
        Alert myAlert = driver.switchTo().alert();
        String alertText= myAlert.getText();
        System.out.println(alertText);
        Assert.assertTrue(alertText.contains(optionText));




    }
}
