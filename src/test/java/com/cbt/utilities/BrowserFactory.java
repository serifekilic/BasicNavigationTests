package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static void main(String[] args) {

        WebDriver driver=getDriver("firefox");
        driver.get("http://google.com");
        System.out.println(driver.getTitle());


    }
    public static WebDriver getDriver(String driver){

        if(driver.equalsIgnoreCase("safari")){

            return new SafariDriver();
        }else if(driver.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();
        }else if(driver.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if(driver.equalsIgnoreCase("edge driver")){

            return  null;
        }else{
            return null;
        }
    }


}
