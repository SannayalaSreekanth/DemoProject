package com.login;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class LoginFunctionality {
    public static void main(String[] args) {
        String path=System.getProperty("user.dir")+"\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
              driver.get("https://accounts.google.com/");
    }
}
