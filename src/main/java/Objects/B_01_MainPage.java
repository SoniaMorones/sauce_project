package Objects;

import Data.TestData_00;
import TestActions.A_01_MainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class B_01_MainPage {

    protected WebDriver driver = null;

    A_01_MainPage MPage = null;
    final TestData_00 data = TestData_00.TEST_DATA;

    public B_01_MainPage(WebDriver driver) {
        this.driver = driver;
        MPage = new A_01_MainPage(driver); // initialize MainPage class
    }

    public void UserField () {

        MPage.CaptureUser().sendKeys(data.UserData());
        Assert.assertTrue("Field Username is not displayed correctly",driver.findElement(By.xpath("//*[@id=\"user-name\"]")).isDisplayed() );
    }

    public void PasswordField () {
        MPage.CepturePassword().sendKeys(data.PasswordData());
        Assert.assertTrue("Field Password is not displayed correctly", driver.findElement(By.xpath("//*[@id=\"password\"]")).isDisplayed());
    }

    public void LoginButtonC (){
        MPage.LoginButton().click();
        Assert.assertFalse("Button Login is not displayed", driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]"))==null);
    }

    public void CorrectLogin () {
        //Validate the logging was successfully
        Assert.assertEquals("Logging not successfully", "PRODUCTS",driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText() );
    }
}
