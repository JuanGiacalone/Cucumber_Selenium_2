package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {

    private ChromeDriver driver = Hooks.getDriver();


    @Given("^El usuario se encuentra en la pagina Home$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de()  {

        // Chequea que se encuentre en Home
    Assert.assertEquals("No se encuentra en el home",
            "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.",
            driver.getTitle());

    }

    @When("^Hace click sobre el boton The little tester comics$")
    synchronized public void hace_click_sobre_el_boton_The_little_tester_comics() throws InterruptedException {

        WebElement linkComics = driver.findElement(By.id("menu-item-2008"));
        WebDriverWait wait = new WebDriverWait(driver, 1);
        WebElement aVisibleComics = wait.until(ExpectedConditions.visibilityOf(linkComics));
        aVisibleComics.click();


    }

    @Then("^Nos redirige a la pantalla de comics$")
    public void nos_redirige_a_la_pantalla_de_comics() {
        // Write code here that turns the phrase above into concrete actions
        WebElement actualTitle = driver.findElement(By.className("page-title"));

        Assert.assertTrue("No se redirecciono a la pagina de comics",actualTitle.isDisplayed());
        Assert.assertEquals("No coincide el text","Category: comics", actualTitle.getText());
    }


}
