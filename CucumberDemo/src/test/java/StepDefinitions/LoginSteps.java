package StepDefinitions;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.SharedLibrary;
import static testBase.SetUpTest.driver;

public class LoginSteps {

	LoginPage lpObj = new LoginPage(); 
	SharedLibrary slObj = new SharedLibrary();

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {


		WebElement txt_userName = lpObj.getUserName(); 
		slObj.enterText(txt_userName,username);

		WebElement txt_password = lpObj.getPassword(); 
		slObj.enterText(txt_password,password);

		Thread.sleep(2000);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {

		WebElement login_button = lpObj.getLoginButton(); 
		slObj.click(login_button);
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {

		WebElement logoutTxt = lpObj.getLogoutTxt(); 
		slObj.displayText(logoutTxt);

		Thread.sleep(2000);
	}
}
