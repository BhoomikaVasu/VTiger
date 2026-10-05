package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.LoginPage;

public class POMPractice {

	@FindBy(name = "user_name")
	WebElement usernameTextField;
	
	public POMPractice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {

		PropertiesUtility putil = new PropertiesUtility();
		SeleniumUtility sutil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		sutil.maximizeWindow(driver);
		sutil.implicitWait(driver, 15);
		String URL = putil.getDataFromProperties("url");
		String UN = putil.getDataFromProperties("username");
		String PWD = putil.getDataFromProperties("password");
		sutil.accessApplication(driver, URL);
		Thread.sleep(2000);
//		WebElement usernameTF = driver.findElement(By.name("user_name"));
//		usernameTF.sendKeys(UN);
//		POMPractice p = new POMPractice(driver);
//		p.usernameTextField.sendKeys(UN);
//		Thread.sleep(2000);
//		sutil.refreshWebpage(driver);
//		Thread.sleep(2000);
//		usernameTF.sendKeys(UN);
//		p.usernameTextField.sendKeys(UN);		
		LoginPage lp = new LoginPage(driver);
//		lp.getUsernameTextfield().sendKeys(UN);
//		lp.getPasswordTextfield().sendKeys(PWD);
//		lp.getLoginBtn().click();
		lp.loginToApplication(UN, PWD);
		
	}

}
