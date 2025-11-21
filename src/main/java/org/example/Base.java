package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {
    public static WebDriver driver;
   public static ThreadLocal<WebDriver>threadLocal=new ThreadLocal<>();

    public static WebDriver init(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        threadLocal.set(driver);
        return driver;

    }
      public static WebDriver getdriver(){
        return threadLocal.get();
      }

    }
