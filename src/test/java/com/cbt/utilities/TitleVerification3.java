package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {


    static WebDriver driver;

    public static void main(String[] args)throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com ", "https://westelm.com/");

        for (int i = 0; i < urls.size(); i++) {
            driver = BrowserFactory.getDriver("chrome");
            driver.get(urls.get(i));
            Thread.sleep(3000);
            String title = driver.getTitle().replace(" ", "").trim().toLowerCase();

            if ( driver.getCurrentUrl().contains(title)) {
                System.out.println( "Test Passed " + "\t"+"Title is " + title );
            } else {
                System.out.println( "Test Failed "+ "\t"+"Title is " + title );
            }
            driver.close();
        }

    }
}




