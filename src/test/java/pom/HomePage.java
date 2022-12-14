package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";

    By titleComicsLocator = By.id("menu-item-2008");

    public HomePage(WebDriver driver) {
        super(driver);
    }

     /*
    WebDriverWait wait = new WebDriverWait(driver, 1);
    WebElement aVisibleComics = wait.until(ExpectedConditions.visibilityOf(linkComics));
        aVisibleComics.click(); */

    public String getTitleHomePage() {
        return titleHomePage;
    }

    public By getTitleComicsLocator() {
        return titleComicsLocator;
    }

    // Para cumplir con el patron POM, las acciones tambien deben estar aca

    public boolean homePageIsDisplayed  () throws Exception  {
        return this.getTitle().equals(titleHomePage);
    }
    public void clickOnTitleComics () throws Exception {
        this.click(titleComicsLocator);
    }
}
