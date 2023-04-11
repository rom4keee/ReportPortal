package abstractClasses.fragments;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.WebDriverWaiter;

import java.util.List;

public class AbstractFragment extends WebDriverWaiter {

    private SelenideElement rootElement;

    public AbstractFragment() {
    }

    public void setRootElement(SelenideElement element) {
        this.rootElement = element;
    }

    public SelenideElement getRootElement() {
        return rootElement;
    }

    public SelenideElement findElement(By element) {
        return rootElement.$(element);
    }

    public List<SelenideElement> findElements(By elements) {
        return rootElement.$$(elements);
    }

    public boolean isElementDisplayed(By element) {
        return rootElement.$(element).isDisplayed();
    }

}
