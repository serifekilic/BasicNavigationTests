package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException{

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        driver=BrowserFactory.getDriver("chrome");
        List<String>title=new ArrayList<>();
        String result1="";
        String result2="";
        for (int i = 0; i <urls.size() ; i++) {
          driver.get(urls.get(i));
         title.add( driver.getTitle() )  ;
        if(  driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")){    ;
             result2="Test Passed: all URLs of all pages are same";
         }else{
             result2="Test Failed";
         }
        }

        System.out.println(result2);

       for(String each:title){
          for(String each1:title){
          //    StringUtility.verifyEquals(each,each1);
              if(each.equals(each1)){
                  result1="Test Passed: They all have the same title";
              }else{
                  result1="Test Failed "+"\t"+"Title: "+each ;
              }
           }
       }
        System.out.println(result1);

        driver.close();

    }
}
