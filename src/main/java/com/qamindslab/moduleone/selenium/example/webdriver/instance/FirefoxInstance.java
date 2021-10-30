package com.qamindslab.moduleone.selenium.example.webdriver.instance;

import com.qamindslab.moduleone.selenium.example.webdriver.instance.manager.withif.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class FirefoxInstance {
    public static void main(String[] args) {
        /*
        File rootPath = new File("src/main/resources");
        File firefoxFilePath = new File(rootPath,"geckodriver");

        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        WebDriver driver = new FirefoxDriver();*/

        WebDriver driver = WebDriverManager.getDriver("fireFox");

        driver.get("https://www.google.com");
    }
}
