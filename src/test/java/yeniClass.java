import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class yeniClass {


    public static void main(String[] args) {
        int i=0;
        System.out.println(i);
    }

    @Test
    public void test(){
        System.setProperty("Webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("");

    }
}
