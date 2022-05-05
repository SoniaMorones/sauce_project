package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_02_InventoryPage {
    WebDriver driver = null; //declare driver

    public A_02_InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement Add_ProductToCart ()
    {


        return  driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
    }

     public WebElement AddProduct_SauceLabsBikeLigh ()
     {
         return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
     }


     public WebElement Click_MenuButton (){

        return driver.findElement(By.id("react-burger-menu-btn"));
     }

     public WebElement Click_Logout (){
        return  driver.findElement(By.id("logout_sidebar_link"));
     }




}
