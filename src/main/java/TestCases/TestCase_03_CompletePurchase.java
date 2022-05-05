package TestCases;

import Base.BaseClass;
import Objects.*;
import TestActions.A_01_MainPage;
import org.junit.Before;
import org.junit.Test;

public class TestCase_03_CompletePurchase extends BaseClass {

 private String testCaseName = this.getClass().getSimpleName();

    @Before

    public void beforeTest () {

        beforeClass(testCaseName);
    }
    @Test

    public void testMain ()
        throws InterruptedException {
        A_01_MainPage pagedisplayed = new A_01_MainPage(driver);
        B_01_MainPage login = new B_01_MainPage(driver);
        B_02_InventoryPage Inventory = new B_02_InventoryPage(driver);
        B_03_ShoppingCartPage  ShoppingCart =new B_03_ShoppingCartPage(driver);
        B_04_CheckoutStepOnePage Checkout01 = new B_04_CheckoutStepOnePage(driver);
        B_05_CheckoutStepTwoPage Checkout02 = new B_05_CheckoutStepTwoPage(driver);
        B_06_CompletePurchasePage CheckoutCompleted = new B_06_CompletePurchasePage(driver);



        pagedisplayed.SuccesssfullyDisplayed();

        System.out.println("Step 01: Write the Username.");
        login.UserField();

        System.out.println("Step 02: Write the Password.");
        login.PasswordField();

        System.out.println("Step 03: Click on the logging button.");
        login.LoginButtonC();

        System.out.println("Step 04: Add first product Sauce Labs Bike Ligh to shopping car. ");
        Inventory.ClickToAddProduct_SauceLabsBikeLigh();

        System.out.println("Step 05:  Add second product Sauce Labs Onesie to shopping car.");
        Inventory.ClickToAddProduct_SauceLabsOnesie();

        System.out.println("Step 06: Go to shopping car page.");
        ShoppingCart.ClickOnShoppingCart();

        System.out.println("Step 07: Click on the checkout button.");
        ShoppingCart.ClickOnCheckoutButton();

        System.out.println("Step 08: Write the first Name on checkout page.");
        Checkout01.FirstNameField();

        System.out.println("Step 09: Write the last name on checkout page.");
        Checkout01.LastNameField();

        System.out.println("Step 10: Write the zip code on checkout page.");
        Checkout01.ZipCodeField();

        System.out.println("Step 11: Click on the CONTINUE button.");
        Checkout01.ContinueButton();

        System.out.println("Step 12: Click on the FINISH button.");
        Checkout02.FinishButton();

        System.out.println("Step 13: The purchase was completed");
        CheckoutCompleted.OrderCompleted();
    }

}
