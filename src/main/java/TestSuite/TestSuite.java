package TestSuite;

import TestCases.TestCase_01_Login;
import TestCases.TestCase_02_AddProductToShoppingCar;
import TestCases.TestCase_03_CompletePurchase;
import TestCases.TestCase_04_LogOut;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Suite.class)


    @Suite.SuiteClasses (
            {
                    TestCase_01_Login.class,
                    TestCase_02_AddProductToShoppingCar.class,
                    TestCase_03_CompletePurchase.class,
                    TestCase_04_LogOut.class
            }

    )

public class TestSuite {

}