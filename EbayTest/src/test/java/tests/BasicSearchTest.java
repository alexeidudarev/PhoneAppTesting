package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class BasicSearchTest extends TestBase {

    @Test(enabled = true)
    public void basicSearchTest(){
        app.getElementsHelper().searchItemOnEbaySite("appium essentials");
    }
    @Test(enabled = true)
    public void basicElemtsAssertionTest(){
        app.getElementsHelper().searchItemOnEbaySite("appium essentials");
        int expected = app.getElementsHelper().getNumbersOfItemExpected();
        int actual = app.getElementsHelper().getNumbersOfItemActual();
        Assert.assertEquals(actual,expected,"num element are not equal");
    }
}
