package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.FirstCase;
import testCaseFunction.SecondCase;
import utils.BaseTest;

@Listeners({Listener.class})
public class SosyopixTestCase extends BaseTest {

    @Test(priority = 0)
    public void firstTest() throws InterruptedException {
        FirstCase first  = new FirstCase(driver);
        first.firstTest();
    }
    @Test(priority = 1)
    public void secondTest() throws InterruptedException {
        SecondCase second  = new SecondCase(driver);
        second.secondTest();
    }



}
