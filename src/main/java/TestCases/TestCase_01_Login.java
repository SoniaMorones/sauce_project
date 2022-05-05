package TestCases;

import Base.BaseClass;
import Objects.B_01_MainPage;
import TestActions.A_01_MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase_01_Login extends BaseClass {

    private String testCaseName = this.getClass().getSimpleName();


    @Before
    public void beforeTest(){
        beforeClass(testCaseName);
    }

    @Test
    public void testMain()
        throws InterruptedException
    {

        A_01_MainPage displayedP = new A_01_MainPage(driver);
        B_01_MainPage mainpg = new B_01_MainPage(driver);

        displayedP.SuccesssfullyDisplayed();

        System.out.println("Step 01: Write Username.");
        mainpg.UserField();

        System.out.println("Step 02: Write Password.");
        mainpg.PasswordField();

        System.out.println("Step 03: Click on the Login button.");
        mainpg.LoginButtonC();

        System.out.println("Step 05: Logging successfully.");
        mainpg.CorrectLogin();
    }

    @After
    public void tearDown () {
       // driver.close();
        afterClass(testCaseName);
    }
}
