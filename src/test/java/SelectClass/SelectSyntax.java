package SelectClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectSyntax {


   /*   STATIC DROP DOWN
  Drip down menu ikiye ayrilir. Birincisi static drop down. Select tag kullanilir.
  Select tag olmazsa select class kullanilamaz.
  Once select classin objesi olusturulur. argumant kismina web elementinin referansi ya da elementin pathi yazilir.
  Uc farkli secme yontemi vardir:
  -select By value
  -select By index
  -select By visibleText (eN cok bu tercih edilir)

   WebElement element = driver.findElement(By.id("Country"));
    Select oSelect = new Select(element);

//Or it can be also written as

    Select oSelect = new Select(driver.findElement(By.id("Country")));

    DYNAMIC DROPDOWN

    Dropdown'a klavyeden komut gondermek icin
    Webelement.sendKeys(Keys.ENTER); baska keyler (ARROWDOWN)
    */
}
