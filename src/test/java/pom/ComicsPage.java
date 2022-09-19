package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicsPage extends BasePage {

        private By pageTitleLocator = By.className("page-title");

        private String titlePage = "Category: comics";

    public ComicsPage(WebDriver driver) {
        super(driver);
    }

    public By getPageTitleLocator() {
        return pageTitleLocator;
    }

    public String getTitlePage() {
        return titlePage;
    }
    public boolean isTitleComicsDisplayed () throws Exception {
        try {
            return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);

        }catch (Exception e) {
            throw e;
        }
    }
}
