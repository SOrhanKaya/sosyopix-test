package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    //BasePage'de ortak kullanılacak nesneleri tanımladım

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }  // driver tanımı yapıldı

    public WebDriver driver;

    public WebElement element(By Locator){
        return driver.findElement(Locator);
    } //Web element tanımı yapıldı





}
