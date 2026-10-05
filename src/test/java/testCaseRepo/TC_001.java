package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_001 extends BaseClass {

	@Test(groups = {"Functionality","Smoke"})
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
		String firstName = eutil.getDataFromExcel("Leads", 1, 1);
		String lastName = eutil.getDataFromExcel("Leads", 1, 2);
		String company = eutil.getDataFromExcel("Leads", 1, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(firstName, lastName, company);
	}
}
