package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class FirstCase extends BasePage {
    String calendar = "Takvim";
    private By searchBox = By.className("search-button");
    private By searchInput = By.id("searchTerms");
    public FirstCase(WebDriver driver) {
        super(driver);
    }
    public void firstTest() throws InterruptedException {
        driver.get("https://www.sosyopix.com");
        Thread.sleep(3500);
        element(searchBox).click();
        Thread.sleep(3000);
        element(searchInput).sendKeys(calendar);
        Thread.sleep(7000);
    }
}
