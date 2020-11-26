package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver17=new ChromeDriver();
        driver17.get("http://facebook.com");
        driver17.findElement(By.id("email")).sendKeys("syntax");
        driver17.findElement(By.id("pass")).sendKeys("syntax123");
        driver17.findElement(By.name("login")).click();
        Thread.sleep(2000);
      //  driver17.findElement((By.linkText("Forgot Password?"))).click();
        driver17.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);
        driver17.quit();
    }
}
