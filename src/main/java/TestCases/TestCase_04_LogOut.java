package TestCases;

import Base.BaseClass;
import Objects.B_01_MainPage;
import Objects.B_02_InventoryPage;
import TestActions.A_01_MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase_04_LogOut extends BaseClass {
    private String testCaseName = this.getClass().getSimpleName();


    @Before
    public void beforeTest(){
        beforeClass(testCaseName);
    }

    @Test
    public void testMain()
            throws InterruptedException {

        A_01_MainPage displayedP = new A_01_MainPage(driver);
        B_01_MainPage mainpg = new B_01_MainPage(driver);
        B_02_InventoryPage InventoryPage = new B_02_InventoryPage(driver);
        displayedP.SuccesssfullyDisplayed();

        System.out.println("Step 01: Write Username.");
        mainpg.UserField();

        System.out.println("Step 02: Write Password.");
        mainpg.PasswordField();

        System.out.println("Step 03: Click on the Login button.");
        mainpg.LoginButtonC();

        System.out.println("Step 05: Logging successfully.");
        mainpg.CorrectLogin();


        System.out.println("Step 06: Click in menu button.");
        InventoryPage.ClickMenuButton_Option();

        System.out.println("Step 07: Click to Logout.");
        InventoryPage.ClickLogout_Option();

    }
        @After
        public void tearDown () {
            // driver.close();
            afterClass(testCaseName);
        }
    }

