package unicorn_TestCases;

import org.testng.annotations.Test;

import unicorn_Enviornment_Setup.Unicorn_Config;

public class TC_Dashborad extends Unicorn_Config{

	@SuppressWarnings("static-access")
	@Test
	public static void loginTestcase() {
		dashboardTestSteps.loginOperations();
		
	}
	
}
