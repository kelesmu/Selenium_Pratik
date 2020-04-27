package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleSyntax {

    @Test
    public void windowHandle() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://twitter.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        System.out.println(driver.getTitle());

        //to get CURRENT WINDOW HANDLE
        String mainHandle = driver.getWindowHandle();
        System.out.println("main handle: " + mainHandle);

        // to get the WINDOW HANDLES OF ALL OPEN WINDOWS
        //eger iki taneyse ikinciye gecmek icin:
        driver.findElement(By.xpath("//span[contains(text(),'Terms')]")).click();

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainHandle)) {
                driver.switchTo().window(handle);
                System.out.println(driver.getWindowHandle());
                System.out.println(driver.getTitle());
            }
        }
    }

    // EGER IKIDEN FAZLAYSA ITERATE ETMEK ICIN:
    @Test
    public void iteratorHandle() {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://twitter.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());

        String mainHandle = driver.getWindowHandle();

        driver.findElement(By.xpath("//span[contains(text(),'Terms')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Cookies')]"));

        Set<String> itrAllHandles = driver.getWindowHandles();
        Iterator<String> itr = itrAllHandles.iterator();
        String parentId = itr.next();
        String childId = itr.next();
    }

}
