package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Assignment {
@Test
	public void handleAssignment() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parentHandle = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		//ikinci sayfaya geciyor
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

	Set<String> allHandles=driver.getWindowHandles();
	for (String handle : allHandles){
		if(!parentHandle.equals(handle)){
			driver.switchTo().window(handle);
		}
	}
	/*
	Iterator<String> itr=allHandles.iterator();
	String parentWindow=itr.next();
	driver.switchTo().window(itr.next()); */

	System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	driver.switchTo().window(parentHandle);
	System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());




	System.out.println(driver.getTitle());
	System.out.println(driver.findElement(By.linkText("New Window")).getText());
	System.out.println(driver.getTitle());
		driver.switchTo().window(parentHandle);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());





	}
}