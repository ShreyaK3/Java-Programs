package simpletestcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleSeleniumTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ExtentReports reports = new ExtentReports("D:\\AutomationSelfLearn\\eclipse-workspace\\Automation\\Output\\report.html");
		ExtentTest test = reports.startTest("ExtentDemo");
		test.log(LogStatus.INFO, "Starting chrome browser and google search");
		driver.get("https://www.google.com");
		test.log(LogStatus.PASS,test.addScreenCapture(capture(driver))+ "TestCase Passed");
		reports.endTest(test);
		reports.flush();
		driver.quit();
		
	}
	
	public static String capture(WebDriver driver) throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("src/../ErrImages" + System.currentTimeMillis()+ ".png");
		String errflpath = destFile.getAbsolutePath();
		FileUtils.copyFile(srcFile, destFile);
		return errflpath;
		
	}

}
