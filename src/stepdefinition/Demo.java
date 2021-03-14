package stepdefinition;

import org.openqa.selenium.support.PageFactory;

import PageObject.LoginPage;
import TestMethod.Methods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	Methods m=new Methods();
	
	 
	@Given("^User should be able to lunch the application$")
	public void user_should_be_able_to_lunch_the_application() throws Throwable {
	  m.excel_con("C:\\Users\\ashk1234\\Desktop\\CucumberTest\\TestData\\abc.xls", "Sheet1");
		m.AppLaunch(m.s.getCell(0, 0).getContents());
		
	}

	@When("^Enter the Correct user name and password$")
	public void enter_the_Correct_user_name_and_password() throws Throwable {
		LoginPage p=PageFactory.initElements(m.driver, LoginPage.class);
		p.username.sendKeys(m.s.getCell(0, 0).getContents());
		p.pwd.sendKeys(m.s.getCell(0, 0).getContents());
		System.out.println("Test");
		
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		LoginPage p=PageFactory.initElements(m.driver, LoginPage.class);
		p.login.click();
	}

	@Then("^capture the title of application$")
	public void capture_the_title_of_application() throws Throwable {
	   m.title();
	   m.closeApp();
	}
	
	@When("^Click on create new account$")
	public void click_on_create_new_account() throws Throwable {
		LoginPage p=PageFactory.initElements(m.driver, LoginPage.class);
		p.create_new_account.click();
	    
	}


}
