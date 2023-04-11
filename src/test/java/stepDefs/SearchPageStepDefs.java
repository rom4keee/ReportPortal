package stepDefs;

import desktop.pages.SearchPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.List;

import static desktop.pages.SearchPage.TITLE;
import static driver.SetUpDriver.getTitle;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchPageStepDefs {

    SearchPage searchPage = new SearchPage();
    private final static Logger logger = Logger.getLogger(SearchPageStepDefs.class);

    @When("I apply the following search filters")
    public void applySearchFilter(DataTable table) {
        searchPage.getSearchFilterFragment().selectOption(table);
        searchPage.getSearchFilterFragment().clickSubmitButton();
    }

    @When("^I click 'Add to basket' button for product with name '([\\w ]+)'")
    public void clickAddToBasketButton(String expectedProductName) throws InterruptedException {
        searchPage.getBookItemFragment().clickAddToBasketButton(expectedProductName);
        logger.info(expectedProductName + " was added to the Basket");
    }


    @Then("Search results contain the following products")
    public void verifySearchResultsContainsProducts(List<String> expectedProductList) {
        assertThat(searchPage.getSearchResultsFragment().getBookItemsTitles())
                .withFailMessage("Search results do not contain the following products")
                .containsAll(expectedProductList);
    }

    @Then("Search results contain only the following products")
    public void verifySearchResultEqualsProduct(List<String> expectedProductList) {
        assertThat(searchPage.getSearchResultsFragment().getBookItemsTitles())
                .withFailMessage("Search results do not contain only the following products ")
                .isEqualTo(expectedProductList);
    }


}
