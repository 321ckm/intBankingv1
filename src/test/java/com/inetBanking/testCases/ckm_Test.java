package com.inetBanking.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ckm_Test {
    public static void main(String[] args) {
       /* WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();*/

        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();

        dr.get("http://demo.guru99.com/V4/");


        /*driver.manage().window().maximize();
        driver.close();*/
    }
}
