//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
              driver.get("https://accounts.google.com/");
//        browser.url("https://accounts.google.com/")//
//                .assert.visible("input[type=email]")
//                //.setValue({selector: 'input[type=search], abortOnFailure : false'},"sreekanth.sannayala@gmail.com")
//                .setValue('input[type=email]',"sreekanth.sannayala@gmail.com")
    }
}
