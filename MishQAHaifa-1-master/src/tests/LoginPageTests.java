package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase{
    @Test
            public  void loginPositive(){
        WebElement login = wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//span[contains(text(),'Login')]")));
        login.click();
        WebElement email_field = wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//input[@formcontrolname='email']")));
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        email_field.click();
        email_field.sendKeys("marina@123.com");
        password_field.click();
        password_field.sendKeys("marina");
        WebElement login_button = driver.findElement(By
                .xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='row justify-content-start']")));
    }
    public void LoginPositive(){

        WebElement login = wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//span[contains(text(),'Login')]")));
        login.click();
        WebElement email_field = wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//input[@formcontrolname='email']")));
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        email_field.click();
        email_field.sendKeys("marina@123.com");
        password_field.click();
        password_field.sendKeys("marina");
        WebElement login_button = driver.findElement(By
                .xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
    }
}
