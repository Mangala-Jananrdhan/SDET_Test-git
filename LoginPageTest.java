package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
    @Test
    public static void verify_Lgi_Working_With_Valid_Credentials(){
        //define webdriver for Browser actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mangala & Vinod\\IdeaProjects\\SeleniumJava\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com/");

        //Enter the user name
        String UserNameTextFieldID="user-name";
        driver.findElement(By.id(UserNameTextFieldID)).sendKeys("standard_user");

        String PasswordFieldID="password";
        driver.findElement(By.id(PasswordFieldID)).sendKeys("secret_sauce");

        String LoginClickButton="login-button";
        driver.findElement(By.id(LoginClickButton)).click();

       //driver.close();


    }

}
