package Base;
import Data.TestData_00;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
protected static WebDriver driver = null;

final TestData_00 data = TestData_00.TEST_DATA;

public void  beforeClass (String testCaseName) {

    driver = getFirefoxDriver();
    driver.manage().deleteAllCookies();
    driver.get(data.GetURL());

    System.out.println(" -->>Test Case:   " + testCaseName +", start to execute");
}



    public WebDriver getFirefoxDriver () {
        System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
        return new FirefoxDriver();
    }


    public void afterClass (String testCaseName) {
        System.out.println("Test case: " +testCaseName+ " , was executed.");

    }

}
