package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {
    //Listener'ları test başlangıcında , test sırasında , test fail olduğunda
    //Ve test başarılı olduğundaki durumlarda takibinin kolaylaşması için kullandım.
    //Test başlarken driver ayaklandırmayı tanımladım.
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test başarılı");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Başarısız");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        System.out.println("test tamamlandı");
        driver.quit();
    }
}
