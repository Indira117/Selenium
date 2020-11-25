package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver1=new ChromeDriver();

        driver1.get("https://google.com");

        driver1.navigate().to("http://facebook.com");

        driver1.navigate().back();

        Thread.sleep(1000); //to stop for 1sec

        driver1.navigate().forward();

        Thread.sleep(1000); //to stop for 1sec

        driver1.navigate().refresh();

       // driver1.close(); //close current tab

        driver1.quit();//will quit the whole tab
    }
}
