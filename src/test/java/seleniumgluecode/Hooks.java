package seleniumgluecode;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberOfCase = 0;

    @Before
    public void setUp () {

        numberOfCase++;

        System.out.println("Se esta ejecutando el escenario nro:" + numberOfCase);

        System.setProperty( "webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://imalittletester.com/");

        driver.manage().window().maximize();
    }

    @After
    public void tearDown () {
        driver.quit();
        System.out.println("Se ejecuto el escenario nro:" + numberOfCase);
    }

    public static ChromeDriver getDriver() {
        return driver;
    }
}
