package desktop.pages;

import abstractClasses.pages.AbstractPage;
import desktop.fragments.BookItemFragment;
import desktop.fragments.SearchFilterFragment;
import desktop.fragments.SearchResultsFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage {

    public static final String SEARCH_PAGE_URL = BASE_URL + "/search";
    public static final String TITLE = "Results for 'Thinking in Java' | Book Depository";

    BookItemFragment bookItemFragment = new BookItemFragment();
    SearchResultsFragment searchResultsFragment = new SearchResultsFragment();
    SearchFilterFragment searchFilterFragment = new SearchFilterFragment();


    @FindBy(xpath = "//title")
    private WebElement pageTitle;

    public BookItemFragment getBookItemFragment() {
        return bookItemFragment;
    }

    public SearchResultsFragment getSearchResultsFragment() {
        return searchResultsFragment;
    }

    public SearchFilterFragment getSearchFilterFragment() {
        return searchFilterFragment;
    }



}
