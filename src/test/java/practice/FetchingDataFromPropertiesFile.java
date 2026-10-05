package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {

//		FileInputStream fis = new FileInputStream("C:\\Users\\nisarga\\Desktop\\TestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String URL = prop.getProperty("url");
//		String UN = prop.getProperty("username");
		PropertiesUtility putil = new PropertiesUtility();
		String URL = putil.getDataFromProperties("url");
		System.out.println(URL);
		String UN = putil.getDataFromProperties("username");
		System.out.println(UN);
		putil.writeDataToProperties("name", "robin", "name is updated");
		WebDriver driver = new ChromeDriver();
//		driver.get(URL);
		
	}

}
