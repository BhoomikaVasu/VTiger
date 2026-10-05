package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Login webpage POM class
 * @author rajat burnwal
 * @version 26-07-29
 */
public class LoginPage {

	//1. Declaring the webelements
	
	@FindBy(name = "user_name")
	private WebElement usernameTextfield;
	
	@FindBy(name = "user_password")
	private WebElement passwordTextfield;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	//2. Initializing the webelements
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//public getter methods
	
	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//3. Utilizing the webelements
	
	/**
	 * This is a business library to perform login operation to web application
	 * @param UN
	 * @param PWD
	 */
	public void loginToApplication(String UN, String PWD) {
		getUsernameTextfield().sendKeys(UN);
		getPasswordTextfield().sendKeys(PWD);
		getLoginBtn().click();
	}
		
}