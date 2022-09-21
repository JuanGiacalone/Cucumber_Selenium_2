package seleniumgluecode;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pom.HomePage;


import java.time.Duration;
import java.util.List;

public class Test extends TestBase {


    private int start;
    private int end;

    @Given("^El usuario se encuentra en la pagina Home$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de() throws Exception {

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
    public void nos_redirige_a_la_pantalla_de_comics() throws Exception {

        Assert.assertTrue("No se redirecciono a la pagina de comics", comicsPage.isTitleComicsDisplayed());

        /*
        WebElement actualTitle = driver.findElement(comicsPage.getPageTitleLocator());
        Assert.assertTrue("No se redirecciono a la pagina de comics",actualTitle.isDisplayed());
        Assert.assertEquals("No coincide el text",comicsPage.getTitlePage(), actualTitle.getText()); */
    }

    @Given("^Existen (\\d+) cocas$")
    public void existenCocas(int start) throws Throwable {
        this.start = start;
    }

    @When("^Me tomo (\\d+) cocas$")
    public void meTomoCocas(int arg1) throws Throwable {
        this.end = this.start - arg1;
    }

    @Then("^Deberian quedar (\\d+) cocas$")
    public void deberianQuedarCocas(int arg1) throws Throwable {
        Assert.assertEquals(arg1, this.end);
    }

    @Given("^Un blog \"([^\"]*)\" con el siguiente contenido$")
    public void unBlogConElSiguienteContenido(String arg1, String arg2) throws Throwable {
        System.out.println(arg1 + arg2);
        Assert.assertTrue(true);
    }

    @Given("^Los siguientes usuarios:$")
    public void losSiguientesUsuarios(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        List<List<String>> rows = table.asLists(String.class);
        List<List<String>> rowsNoHeaders = rows.subList(1, rows.size());

        for (List<String> row : rowsNoHeaders) {
            System.out.println(row.get(0) + row.get(1) + row.get(2));
        }

    }
}
