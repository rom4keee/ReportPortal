package utils;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.WebDriverRunner.driver;

public class WebDriverWaiter {

    static WebDriverWait wait = new WebDriverWait(driver().getWebDriver(), 5);

    public WebDriverWaiter() {
    }

    public static void waitUntilElementToBeClickable(SelenideElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

}
