package Objects;

import Data.TestData_00;
import TestActions.A_04_CheckoutStepOnePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class B_04_CheckoutStepOnePage {

    WebDriver driver = null;
    A_04_CheckoutStepOnePage CheckoutPage01 = null;

    //Use data from TestData_00 class
       final TestData_00 data = TestData_00.TEST_DATA;

    public B_04_CheckoutStepOnePage (WebDriver driver) {

        this.driver = driver;
        CheckoutPage01 = new A_04_CheckoutStepOnePage(driver);

    }

    public void FirstNameField () {


        Assert.assertTrue("Fist Name field was not displayed",
                           driver.findElement(By.cssSelector("#first-name")).isDisplayed());

        CheckoutPage01.WriteFirstName().sendKeys(data.FirstNameData());
    }

    public void LastNameField () {


        Assert.assertTrue("Last Name field was not displayed",
                driver.findElement(By.cssSelector("#last-name")).isDisplayed());

        CheckoutPage01.WriteLastName().sendKeys(data.LastNameData());

    }
    public void ZipCodeField () {
       Assert.assertTrue("Zip Code field was not displayed",
                         driver.findElement(By.cssSelector("#postal-code")).isDisplayed());

        CheckoutPage01.WriteZipCode().sendKeys(data.ZipCodeData());
    }

    public void ContinueButton () {

      Assert.assertTrue("Continue button was not displayed", driver.findElement(By.xpath("//*[@id=\"continue\"]")).isDisplayed());

      CheckoutPage01.ClickOnContinueButton().click();
    }

}
