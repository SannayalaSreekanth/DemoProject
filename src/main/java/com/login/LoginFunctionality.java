/**
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
package com.login;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//login to gmail app 
 public final class LoginFunctionality {
     private void FilePathHelper() {
         final String path = System.getProperty("user.dir") + "\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", path);
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://accounts.google.com/");
     }
//     static void main(String[] args) {
//        String path = System.getProperty("user.dir") + "\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", path);
//        WebDriver driver = new ChromeDriver();
//              driver.manage().window().maximize();
//              driver.get("https://accounts.google.com/");
//    }
}
