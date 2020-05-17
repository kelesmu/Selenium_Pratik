package Alistirmalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingChair {

    @Test
    public void sorting() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.schoolfurniture4less.com/school-classroom-seating?srule=PriceLowtoHigh&sz=24&start=24");
        List<WebElement> listElement = driver.findElements(By.cssSelector("span[class='product-sales-price']"));
        Thread.sleep(1000);
       // driver.findElement(By.id("grid-sort-header")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//select[@id='grid-sort-header']/option[1]")).click();

/*
        Thread.sleep(1000);
        driver.findElement(By.id("grid-sort-header")).sendKeys(Keys.UP); */

//        driver.findElement(By.xpath("//option[text()='Sort By: Price - High to Low'][1]")).click();
Thread.sleep(3000);
        ArrayList<String> priceListText = new ArrayList<String>();
        for (int t=0; t<7;t++) {

            priceListText.add(listElement.get(t).getText());
        }


        ArrayList<String> subStringOriginalPriceList = new ArrayList<String>();
        for (String price: priceListText) {
            subStringOriginalPriceList.add(price.substring(1));

        }
    for(int i=0; i<subStringOriginalPriceList.size(); i++){
        System.out.println("=========" +subStringOriginalPriceList.get(i)); }



    ArrayList<Double> convertedOriginalPriceList = new ArrayList<Double>();
        for (int k=0; k< subStringOriginalPriceList.size(); k++) {
            convertedOriginalPriceList.add(Double.parseDouble(subStringOriginalPriceList.get(k)));}

            for (int j=0; j<convertedOriginalPriceList.size();j++){
                System.out.println("---------" + convertedOriginalPriceList.get(j));
            }

ArrayList<Double> copiedList=new ArrayList<Double>();
        for (Double price:convertedOriginalPriceList) {
            copiedList.add(price);
        }
        for (Double price: copiedList){
            System.out.println("#########" +price);
        }
       Collections.sort(copiedList);
        Assert.assertEquals(convertedOriginalPriceList,copiedList);
        System.out.println(priceListText);

    }
}
