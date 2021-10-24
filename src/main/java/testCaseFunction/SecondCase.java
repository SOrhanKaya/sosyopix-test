package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SecondCase extends BasePage {
    public SecondCase(WebDriver driver) {
        super(driver);
    }

    private By artMenu = By.cssSelector(".dropdown-menu-content > li:nth-child(9) > a:nth-child(1)");
    private By divElement = By.cssSelector("a.item:nth-child(3)");
    private By childDivElement = By.cssSelector("a.item:nth-child(4)");
    private By addToBasketButton = By.cssSelector("div.detail:nth-child(3) > div:nth-child(3) > button:nth-child(1)");
    public void secondTest() throws InterruptedException {
        driver.get("https://www.sosyopix.com");
        Thread.sleep(3000);
        element(artMenu).click();
        Thread.sleep(3000);
        element(divElement).click();
        Thread.sleep(3000);
        element(childDivElement).click();
        Thread.sleep(3000);
        element(addToBasketButton).click();
        Thread.sleep(10000);
    }
}
