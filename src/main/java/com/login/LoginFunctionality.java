package com.login; /**
 * Some javadoc. // OK
 *
 * @author Some javadoc. // OK
 * @version Some javadoc. // OK
 * @param Some javadoc. // OK
 * @return Some javadoc. // OK
 * @since Some javadoc. // OK
 * @serial Some javadoc. // OK
 * @serialField // OK
 * @serialData // OK
 * @deprecated Some javadoc. // OK
 */
//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.logging.Logger;
@Test
//login to gmail app
 public final class LoginFunctionality {
     public  void login() {
          Logger log = Logger.getLogger("InfoLogging");
           String path = System.getProperty("user.dir") + "/chromedriver.exe";
         //System.out.println(System.getProperty("user.dir"));
         System.out.println(path);
         System.setProperty("webdriver.chrome.driver", path);
         ChromeOptions options = new ChromeOptions();options. addArguments("--headless");
         WebDriver driver = new ChromeDriver(options);
         //WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://accounts.google.com/");
         //System.out.println("lanched the gmail");
         log.info("successfully logged into gmail");
        // driver.findElement(By.id("\"input[type=email]\""));
     }
}
