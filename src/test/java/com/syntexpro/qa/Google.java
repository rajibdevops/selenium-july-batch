package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {

        WebDriver rajib= new ChromeDriver();
        rajib.get("https://google.com");
        rajib.manage().window().maximize();
        Thread.sleep(Long.parseLong("5000"));
        rajib.findElement(By.name("q")).sendKeys("New York");
        rajib.findElement(By.name("btnK")).submit();

    }


}
