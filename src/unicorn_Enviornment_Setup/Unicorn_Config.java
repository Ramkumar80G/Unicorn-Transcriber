package unicorn_Enviornment_Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import unicorn_PageObjects.Dashboard_Objects;
import unicorn_PageOperations.Mouse_KeyBoard_Actions;
import unicorn_TestSteps.Dashboard_TestSteps;

public class Unicorn_Config {

	//Globally WebDriver Initialization
	protected static WebDriver driver = null;
	
	//Module's //Object's Reference Initialization
	protected static Mouse_KeyBoard_Actions actionsMK;
	protected static Dashboard_Objects dashBoardPage;
	protected static Dashboard_TestSteps dashboardTestSteps; 
	
	
	
	@BeforeTest
	protected static void baseConfigurationEnviornmentSetup() {
		System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		String URL = ("http://localhost:3010/");
		driver.navigate().to(URL);
		driver.manage().deleteAllCookies();
		// Add Implicitly Wait to driver
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Actions Reference Initialization.
		actionsMK = new Mouse_KeyBoard_Actions();
		
		// Object Reference Initialization.
		dashBoardPage = new Dashboard_Objects(driver);
		
		// TestSteps Reference Initialization.
		dashboardTestSteps = new Dashboard_TestSteps();
	}
	
	
	
}
