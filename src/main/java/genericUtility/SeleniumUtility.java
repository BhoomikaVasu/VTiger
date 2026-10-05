package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is a utility class which stores the functionality from Selenium library
 * @author rajat burnwal
 * @version 26-07-27
 */
public class SeleniumUtility {

	/**
	 * This is a generic method to access a web application
	 * @param driver
	 * @param URL
	 */
	public void accessApplication(WebDriver driver, String URL) {
		driver.get(URL);
	}
	
	/**
	 * This is a generic method to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This is a generic method to provide implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	/**
	 * This is a generic method to refresh the webpage
	 * @param driver
	 */
	public void refreshWebpage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	////////***Handling Dropdowns *****/////////
	
	/**
	 * This is a generic method to select an option in dropdown using index
	 * @param dropdownEle
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownEle, int index) {
		Select sel = new Select(dropdownEle);
		sel.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select an option in dropdown using value att.
	 * @param dropdownEle
	 * @param valueAttribute
	 */
	public void selectOptionByValue(WebElement dropdownEle, String valueAttribute) {
		Select sel = new Select(dropdownEle);
		sel.selectByValue(valueAttribute);
	}
	
	/**
	 * This is a generic method to select an option in dropdown using visible text
	 * @param dropdownEle
	 * @param text
	 */
	public void selectOptionByVisibleText(WebElement dropdownEle, String text) {
		Select sel = new Select(dropdownEle);
		sel.selectByVisibleText(text);
	}
	
	////////****** Handling Mouse Action ********////////
	
	/**
	 * This is a generic method to perform mouse hovering action
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform right click action
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform double click action
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/////////******* Handling Alert *******/////////
	
	/**
	 * This is a generic method to accept alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to dismiss the alert popup
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/////////******* Handling Frames ******//////////
	
	/**
	 * This is a generic method to switch the control to frame using index
	 * @param driver
	 * @param frameIndex
	 */
	public void switchToFrameUsingIndex(WebDriver driver, int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	
	/**
	 * This is a generic method to switch the control to frame using frame element
	 * @param driver
	 * @param frameEle
	 */
	public void switchToFrameUsingFrameEle(WebDriver driver, WebElement frameEle) {
		driver.switchTo().frame(frameEle);
	}
	
	////////******* Taking webpage screenshot *******///////
	
	/**
	 * This is a generic method to capture webpage screenshot
	 * @param driver
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public String takeWebpageScreenshot(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\"+fileName+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath(); 			//used in Listeners
	}
	
}
