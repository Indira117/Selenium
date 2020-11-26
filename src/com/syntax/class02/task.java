package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver1=new ChromeDriver();
        driver1.get(" http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver1.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver1.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(1000);
        driver1.findElement(By.id("ctl00_MainContent_login_button")).click();
        String name=driver1.getTitle();
        System.out.println(name);
       Thread.sleep(1000);
        String name1="Web Orders";
        if (name.equalsIgnoreCase((name1))){
            System.out.println("title match");
        }else {
            System.out.println("Title don't match");
        }
        driver1.findElement(By.linkText("Logout")).click();
        Thread.sleep(1000);
        driver1.close();
    }
}
