package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

   static WebDriver driver;
    public static void main(String[] args)throws InterruptedException {

        chrome();
        fireFox();
        safari();

    }
   public static void fireFox()throws InterruptedException{
       driver= BrowserFactory.getDriver("firefox");
       driver.get("http://google.com");
       String title1=driver.getTitle();
       Thread.sleep(1000);

       driver.navigate().to("http://etsy.com");
       String title2=driver.getTitle();
       Thread.sleep(1000);

       driver.navigate().back();
       String title3=driver.getTitle();
       StringUtility.verifyEquals(title3,title1);
       Thread.sleep(1000);

       driver.navigate().forward();
       String title4=driver.getTitle();
       StringUtility.verifyEquals(title4,title2);
       Thread.sleep(1000);
       driver.quit();
   }


    public static void chrome()throws InterruptedException{
        driver= BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        String title1=driver.getTitle();
        Thread.sleep(1000);

        driver.navigate().to("http://etsy.com");
        String title2=driver.getTitle();
        Thread.sleep(1000);

        driver.navigate().back();
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title3,title1);
        Thread.sleep(1000);

        driver.navigate().forward();
        String title4=driver.getTitle();
        StringUtility.verifyEquals(title4,title2);
        Thread.sleep(1000);
        driver.quit();
    }
    public static void safari()throws InterruptedException{
        driver= BrowserFactory.getDriver("safari");
        driver.get("http://google.com");
        String title1=driver.getTitle();
        Thread.sleep(1000);

        driver.navigate().to("http://etsy.com");
        String title2=driver.getTitle();
        Thread.sleep(1000);

        driver.navigate().back();
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title3,title1);
        Thread.sleep(1000);

        driver.navigate().forward();
        String title4=driver.getTitle();
        StringUtility.verifyEquals(title4,title2);
        Thread.sleep(1000);
        driver.quit();
    }

}



