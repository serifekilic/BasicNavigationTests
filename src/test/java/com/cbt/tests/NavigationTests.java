package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    static WebDriver driver;
    public static void main(String[] args)throws InterruptedException {

   browserTest("firefox");


    }

    public static void browserTest(String browser)throws InterruptedException{
      driver= BrowserFactory.getDriver(browser);
      driver.get("http://google.com");
      String title1=driver.getTitle();
        System.out.println(title1);
        Thread.sleep(1000);

        driver.navigate().to("http://etsy.com");
        String title2=driver.getTitle();
        System.out.println(title2);
        Thread.sleep(1000);

        driver.navigate().back();
        String title3=driver.getTitle();
        if(title3.equals(title1)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(1000);

        driver.navigate().forward();
        String title4=driver.getTitle();
        if(title4.equals(title2)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(1000);
        driver.quit();
    }

}
