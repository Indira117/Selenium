package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver site1=new ChromeDriver();
        site1.get("https://amazon.com");

        String urlsite =site1.getCurrentUrl();
        System.out.println(urlsite);

        String siteTitle=site1.getTitle();
        System.out.println(siteTitle);
    }

}
