package stepDefinitions;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage=new LoginPage();
	HomePage homePage;
	WebDriver driver;
	
@Given("To navigate to website")
public void to_navigate_to_website() {
    // Write code here that turns the phrase above into concrete actions	
	new TestBase();
	initialization();
	System.out.println("I am in 1st step");
	
   
}


@Then("verify LoginPage title")
public void verify_loginpage_title() {
	
	System.out.println("I am in 2nd page");
	System.out.println(loginPage.validateLoginPageTitle());

	Assert.assertEquals("Customer Login",loginPage.validateLoginPageTitle());

}


@When("enter the {string} and {string}  and click submit button")
public void enter_the_and_and_click_submit_button(String userName,String password) throws Exception {
 
  homePage= loginPage.login(userName, password);
}


//
//@When("enter the {string} and {string}  and click submit button")
//public void enter_the_and_and_click_submit_button(String string, String string2) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}







}
