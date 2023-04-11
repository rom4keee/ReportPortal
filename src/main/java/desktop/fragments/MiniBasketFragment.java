package desktop.fragments;


import abstractClasses.fragments.AbstractFragment;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MiniBasketFragment extends AbstractFragment {

    private final SelenideElement fragmentRootElement = $x("//div[@class='mini-basket']");

    public MiniBasketFragment() {
    }

    public String getCheckoutOrderSummary(String fieldName) {
        return $x("//dt/strong[contains(text(),'" + fieldName
                + "')]/ancestor::dt/following-sibling::dd")
                .getText();
    }

}
