import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTutorialPointBdd {

    private WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanss\\Desktop\\Software Development Academy\\Kody\\SdaFinalTest\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void provedPoUkonceniTestu(){
        driver.close();
        driver.quit();
    }

    @Given("Uzivatel je na strance tutorialpoint checkbox")
    public void uzivatelJeNaStranceTutorialpointCheckbox() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        driver.manage().window().setSize(new Dimension(1936, 1048));
    }

    @When("Uzivatel zaklikne checkbox s id {string}")
    public void uzivatelZaklikneCheckboxSId(String idPrvku) {
        driver.findElement(By.id(idPrvku)).click();
    }

    @Then("Uzivatel vidi zaskrtnuty checkbox s id {string}")
    public void uzivatelVidiZaskrtnutyCheckboxSId(String idPrvku) {
        Assert.assertTrue(driver.findElement(By.id(idPrvku)).isSelected());
    }
}
