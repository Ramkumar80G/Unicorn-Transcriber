package unicorn_TestSteps;

import org.openqa.selenium.WebElement;

import unicorn_Enviornment_Setup.Unicorn_Config;
import unicorn_PageOperations.Mouse_KeyBoard_Actions;

public class Dashboard_TestSteps extends Unicorn_Config{
	
	@SuppressWarnings("static-access")
	public static void loginOperations() {
		
		actionsMK.clickWebElement(dashBoardPage.paulNelsonUserButton);
		
	}
}
