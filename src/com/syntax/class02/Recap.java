package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver17=new ChromeDriver();
        driver17.get("http://facebook.com");
        driver17.manage().window().maximize();
       // driver17.manage().window().fullscreen(); //no frame
    String titleName= driver17.getTitle();
        System.out.println(titleName);
    if (titleName.equalsIgnoreCase("Facebook - Log in or Sign up")){
        System.out.println("Title is right");
    }else{
        System.out.println("Title is WRONG");
    }
    }
}
