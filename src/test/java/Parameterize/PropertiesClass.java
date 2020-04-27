package Parameterize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    WebDriver driver=null;


    @Test
    public void Login() throws IOException {

        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("/Users/mustafakeles/Selenium_Pratik/src/test/java/" +
                "Parameterize/dataDriven.properties");
        prop.load(fis);

        System.out.println(prop.getProperty("username"));

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        if(prop.getProperty("browser").equals("firefox"))
        {
            driver =new FirefoxDriver();
        }

        else if(prop.getProperty("browser").equals("chrome"))

        {
            driver =new ChromeDriver();
        }
        else

        {
            driver =new InternetExplorerDriver();

        }

        driver.get(prop.getProperty("url"));
        System.out.println(driver.getTitle());

        driver.close();

//driver.findElement(By.xpath:').sendkeys(username)

    }
}
