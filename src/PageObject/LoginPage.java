package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public @FindBy(xpath="//*[@id='login1']") WebElement username;
	public @FindBy(xpath="//*[@id='password']") WebElement pwd;
	public @FindBy(xpath="//*[@name='proceed']")WebElement login;
	public @FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/form/div[2]/div/a/u") WebElement create_new_account;
}
