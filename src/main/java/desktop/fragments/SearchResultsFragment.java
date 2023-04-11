package desktop.fragments;

import abstractClasses.fragments.AbstractFragment;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchResultsFragment extends AbstractFragment {

    private final SelenideElement itemTitle = $x("//div[@class='book-item']//h3[@class='title']");
    private final SelenideElement bookItem = $x("//div[@class='book-item']");
    private final List<SelenideElement> booksItemsCollection = $$x("//div[@class='book-item']//h3");

    public SearchResultsFragment() {
    }

    public List<String> getBookItemsTitles() {
        return booksItemsCollection.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

}
