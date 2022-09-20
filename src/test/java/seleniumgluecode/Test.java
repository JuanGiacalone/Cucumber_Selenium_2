package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pom.HomePage;


import java.time.Duration;

public class Test extends TestBase{




    @Given("^El usuario se encuentra en la pagina Home$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de() throws Exception  {

        Assert.assertTrue(homePage.homePageIsDisplayed());

        // Chequea que se encuentre en Home
    /*Assert.assertEquals("No se encuentra en el home",
            homePage.getTitleHomePage(),
            driver.getTitle());
    */
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics() throws Exception {

     // WebElement titleComicsLocator = driver.findElement(homePage.getTitleComicsLocatorBy());
      // titleComicsLocator.click();
        //  homePage.clickOnTitleComics();
        System.out.println("Elemento: " + homePage.titleComicsLocator);
        homePage.clickOnTitleComics();
    }

    @Then("^Nos redirige a la pantalla de comics$")
    public void nos_redirige_a_la_pantalla_de_comics() throws Exception{

        Assert.assertTrue("No se redirecciono a la pagina de comics", comicsPage.isTitleComicsDisplayed());

        /*
        WebElement actualTitle = driver.findElement(comicsPage.getPageTitleLocator());
        Assert.assertTrue("No se redirecciono a la pagina de comics",actualTitle.isDisplayed());
        Assert.assertEquals("No coincide el text",comicsPage.getTitlePage(), actualTitle.getText()); */
    }


}
