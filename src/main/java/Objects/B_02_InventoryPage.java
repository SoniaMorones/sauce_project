package Objects;

import TestActions.A_02_InventoryPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class B_02_InventoryPage {

  protected   WebDriver driver= null;

    A_02_InventoryPage PageInv = null;

  public B_02_InventoryPage (WebDriver driver) {
      this.driver = driver;
      PageInv = new A_02_InventoryPage(driver);
  }


   public void ClickToAddProduct_SauceLabsOnesie ()
          throws InterruptedException {
           Thread.sleep(1000);
          PageInv.Add_ProductToCart().click();

          //Validate the product was added to the car
             Assert.assertEquals("The product was not added on the car",
             "REMOVE",driver.findElement(By.cssSelector("#remove-sauce-labs-onesie")).getText());

   }

  public void ClickToAddProduct_SauceLabsBikeLigh() {
      PageInv.AddProduct_SauceLabsBikeLigh().click();

      //Validate the product was added to the car
      Assert.assertEquals("The product was not added on the car",
              "REMOVE",driver.findElement(By.cssSelector("#remove-sauce-labs-bike-light")).getText());

  }

  public void ClickMenuButton_Option () {

      Assert.assertTrue("Menu Button was not displayed", driver.findElement(By.cssSelector("#react-burger-menu-btn")).isDisplayed());
      PageInv.Click_MenuButton().click();

  }

  public void ClickLogout_Option () {

      Assert.assertTrue("Logout option was not displayed", driver.findElement(By.cssSelector("#logout_sidebar_link")).isDisplayed());
      PageInv.Click_Logout().click();

  }


}