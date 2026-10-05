package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is a Create New Lead webpage POM class
 * @author rajat burnwal
 * @version 26-07-31
 */
public class CreatingNewLeadPage {

	@FindBy(name = "firstname")
	private WebElement firstNameTextfield;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextfield;
	
	@FindBy(name = "company")
	private WebElement companyTextfield;
	
	@FindBy(name = "designation")
	private WebElement titleTextfield;
	
	@FindBy(name = "leadsource")
	private WebElement leadSourceDropdown;
	
	@FindBy(name = "noofemployees")
	private WebElement noOfEmpTextfield;
	
	@FindBy(name = "mobile")
	private WebElement mobileTextfield;
	
	@FindBy(name = "email")
	private WebElement emailTextfield;
	
	@FindBy(name = "city")
	private WebElement cityTextfield;
	
	@FindBy(name = "state")
	private WebElement stateTextfield;
	
	@FindBy(name = "country")
	private WebElement countryTextfield;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}

	public WebElement getCompanyTextfield() {
		return companyTextfield;
	}

	public WebElement getTitleTextfield() {
		return titleTextfield;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getNoOfEmpTextfield() {
		return noOfEmpTextfield;
	}

	public WebElement getMobileTextfield() {
		return mobileTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getCityTextfield() {
		return cityTextfield;
	}

	public WebElement getStateTextfield() {
		return stateTextfield;
	}

	public WebElement getCountryTextfield() {
		return countryTextfield;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param fname
	 * @param lname
	 * @param company
	 */
	public void createNewLead(String fname, String lname, String company) {
		getFirstNameTextfield().sendKeys(fname);
		getLastNameTextfield().sendKeys(lname);
		getCompanyTextfield().sendKeys(company);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param lname
	 * @param company
	 * @param title
	 * @param leadSource
	 * @param noOfEmp
	 */
	public void createNewLead(String lname, String company, String title,
			String leadSource, String noOfEmp) {
		getLastNameTextfield().sendKeys(lname);
		getCompanyTextfield().sendKeys(company);
		getTitleTextfield().sendKeys(title);
		new SeleniumUtility().selectOptionByValue(getLeadSourceDropdown(), leadSource);
		getNoOfEmpTextfield().sendKeys(noOfEmp);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param lname
	 * @param company
	 * @param mobile
	 * @param email
	 * @param city
	 * @param state
	 * @param country
	 */
	public void createNewLead(String lname, String company, String mobile,
			String email, String city, String state, String country) {
		getLastNameTextfield().sendKeys(lname);
		getCompanyTextfield().sendKeys(company);
		getMobileTextfield().sendKeys(mobile);
		getEmailTextfield().sendKeys(email);
		getCityTextfield().sendKeys(city);
		getStateTextfield().sendKeys(state);
		getCountryTextfield().sendKeys(country);
		getSaveButton().click();
	}
	
}
