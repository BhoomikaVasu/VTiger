package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	
	JavaUtility jutil=new JavaUtility();
	String dateTimeStamp=jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	ExtentReports reports;

	@Override
	public void onTestStart(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println("On Test start executed");
		
		//create a filed into report for every @Test method with method name
		reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println("On Test success executed");
		
		//screenshot of webpage
		JavaUtility jutil=new JavaUtility();
		String dateTimeStamp=jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		String screenshotName=methodName+"-"+dateTimeStamp;
		SeleniumUtility sutil=new SeleniumUtility();
//		try {
//			sutil.takeWebpageScreenshot(BaseClass.sdriver, screenshotName);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test failure executed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test skipped executed");		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On start executed");
		
		//Configuration of Extent Reports
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\ExtentReports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Reports");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		
		//generate an empty report
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888/");
		reports.setSystemInfo("Base OS", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Anusha");
	
		
	}

	@Override
	public void onFinish(ITestContext context) {		
		System.out.println("On finish executed");
		
		//flush the report
		reports.flush();
	}
	
}
