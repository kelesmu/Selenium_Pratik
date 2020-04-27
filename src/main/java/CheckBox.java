
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));

        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(checkBox1));

        checkBox1.click();
        System.out.println(checkBox1.isSelected());
        checkBox1.click();
        System.out.println(checkBox1.isSelected());

System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    }
}
