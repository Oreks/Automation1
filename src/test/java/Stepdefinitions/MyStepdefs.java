package Stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyStepdefs {

    @When("^I go to the registration$")
    public void iGoToTheRegistration() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @And("^I fill in all the registration detail$")
    public void iFillInAllTheRegistrationDetail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be able to register$")
    public void iShouldBeAbleToRegister() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Given("^I navigate to  website$")
    public void iNavigateToWebsite1() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:\\SDET University\\Software\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
       // WebDriver driver = new ChromeDriver();

        driver.get("https://dev.giftrt.com/");

        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

}