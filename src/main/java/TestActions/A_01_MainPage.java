package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_01_MainPage {

    WebDriver driver = null;


public A_01_MainPage(WebDriver driver) {

    this.driver = driver;
}

public void SuccesssfullyDisplayed () {
    if (driver.getTitle().equals("Swag Labs"))
        System.out.println("Step 00: Swag Labs displayed successfully.");
     else
        System.out.println("Step 00: the Swag Labs page was not displayed correctly.");

    }


public WebElement CaptureUser () {

    return driver.findElement(By.id("user-name"));
}


public WebElement CepturePassword (){

    return driver.findElement(By.id("password"));
}

public WebElement LoginButton (){

    return  driver.findElement(By.id("login-button"));
}

}
