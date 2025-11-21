package StepDefination;

import PagesCode.PageLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Base;

public class StepLogin {
    PageLogin pagelogin=new PageLogin(Base.getdriver());
    @Given("user is on login page")
    public void userIsOnLoginPage() {
    }

    @When("user is enterd valid userid and password")
    public void userIsEnterdValidUseridAndPassword() {

    }

    @And("user click on login button")
    public void userClickOnLoginButton() {

    }

    @Then("user should navigate the product page")
    public void userShouldNavigateTheProductPage() {
    }

    @When("user is enter valid {string} and {string} details")
    public void user_is_enter_valid_and_details(String string, String string2) {
    pagelogin.dologin(string,string2);
    }
}
