package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        WebDriver driver1= new ChromeDriver(); //launch browser

        driver1.get("https://syntaxtechs.com/");// link to open or navigate to url

        String urlName1=driver1.getCurrentUrl();
        System.out.println(urlName1); //print current link in the console

        String titleName1=driver1.getTitle();
        System.out.println(titleName1); // print title of the page


    }
}
