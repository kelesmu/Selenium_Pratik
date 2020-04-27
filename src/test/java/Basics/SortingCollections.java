package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

    @Test
    public void sorting() {
/*Mantik olarak oncelikle tum column textleri bir listede toplaniyor. Daha sonra ikinci bir ArrayList olusturup ilk liste
 buna kaydediliyor. Daha sonra bu liste java-collection yardimiyla reversing or assending seklinde sorted ediliyor.
Sorted edilen liste ile ilk listenin Equel olup olmadigi kontrol ediliyor.
*/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

    //Tabloda listelenecek kolonun assending ya da desending olmasi icin 1 ya da iki kez tiklaniyor
        driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
        driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

        //Listelenecek kolonun ortak locatori bulunup elementler listeleniyor.

        List<WebElement> firstColList= driver.findElements(By.cssSelector("tr td:nth-child(2)"));

        //Ardindan bu elementlerin textleri for loop ile elde edilerek original text listesi olusturuluyor.

        ArrayList<String> originalList=new ArrayList<String>();
        for(int i=0;i<firstColList.size();i++)
        {
            originalList.add(firstColList.get(i).getText());
        }

        //Sonra ikinci bir ArrayList hazirlanip for loop ile ilk liste ikinciye kopyalaniyor.

        ArrayList<String> copiedList =new ArrayList<String>();

        for(int i=0;i<originalList.size();i++) {
            copiedList.add(originalList.get(i));
        }

     //Bu kopyalanan liste sort ediliyor. Default sort metodu assending olarak siraliyor. Descending icin reverse metodu.
       Collections.sort(copiedList);
       // Collections.reverse(copiedList);

        for(String s1:originalList ) {
            System.out.println(s1);
        }

        System.out.println("*******************");

        for(String s2:copiedList ){
            System.out.println(s2);
        }

        //Assert ile iki listenin ayni olup olmadigi kontrol ediliyor.
        Assert.assertTrue(originalList.equals(copiedList));
    } }

