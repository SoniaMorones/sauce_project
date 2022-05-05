package TestCases;

import Base.BaseClass;
import Objects.B_01_MainPage;
import Objects.B_02_InventoryPage;
import TestActions.A_01_MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase_02_AddProductToShoppingCar extends BaseClass {

    private String testCaseName = this.getClass().getSimpleName();


    @Before
    public void beforeTest() {
        beforeClass(testCaseName);
    }

    @Test
    public void testMain ()
        throws InterruptedException
    {
        A_01_MainPage validateURL =new A_01_MainPage(driver);
        B_01_MainPage MainPg = new B_01_MainPage(driver);
        B_02_InventoryPage InventoryPageOpt = new B_02_InventoryPage (driver);


        validateURL.SuccesssfullyDisplayed();

        System.out.println("Step 01: Write the Username.");
        MainPg.UserField();
        System.out.println("Step 02: Write the password.");
        MainPg.PasswordField();
        System.out.println("Step 03: Click on the logging button.");
        MainPg.LoginButtonC();
        System.out.println("Step 04: Add product Sauce Labs Onesie to shopping car.");
        InventoryPageOpt.ClickToAddProduct_SauceLabsOnesie();
    }

    @After
    public void tearDown () {
      //  driver.close();
        afterClass(testCaseName);
    }
}