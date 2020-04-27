import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class FacebookSignUp {



    /** Enter "Happy" in Firstname
     * Enter "Peace" in Last Name
     * Enter "1234567890" in Email or Mobile Number
     * Enter "test1234" in New Password
     * Select Date as : 11 October 2001
     * if Gender is not Selected
     *      then Select your Gender
     * Assert, if Gender is selected
     * Click "Sign Up" button
     * Verify "Please enter a valid mobile number or email address" error message displayed.*/


By firstName= By.name("firstname");
By lastName=By.name("lastname");
By emailMobile=By.xpath("//input[starts-with(@name, 'reg_email__')]");
By password = By.xpath("//div[text()='New password']//following-sibling::input[@type='password']");
By month= By.id("month");
By  day=By.id("day");
By year= By.id("year");
By gender=By.xpath("//label[text()= 'Male']//preceding::input[@value='2']");
By signUpButton= By.xpath("//button[text()='Sign Up'and@name='websubmit']");
By errorMsg= By.xpath("//div[starts-with(text(), 'Please enter a valid')]");



     @Test
    public void signUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.findElement(firstName).sendKeys("Happy");
        driver.findElement(lastName).sendKeys("Peace");
        driver.findElement(emailMobile).sendKeys("1234567890");
        driver.findElement(password).sendKeys("test1234");
         Select slct=new Select(driver.findElement(month));
         slct.selectByVisibleText("Oct");
         Select slct1=new Select(driver.findElement(day));
         slct1.selectByVisibleText("11");
         Select slct2=new Select(driver.findElement(year));
         slct2.selectByIndex(20);
       //  Thread.sleep(5000);
      WebElement maleButton= driver.findElement(gender);
     boolean ifSelected=    maleButton.isSelected();
    if(ifSelected==false){
    maleButton.click();
    driver.findElement(signUpButton).click();

    String actualErrorMsg=    driver.findElement(errorMsg).getText();
    String expectedErrMsg="Please enter a valid mobile number or email address.";

        Assert.assertEquals(expectedErrMsg, actualErrorMsg);

}


    }
}
