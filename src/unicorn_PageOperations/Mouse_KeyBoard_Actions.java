package unicorn_PageOperations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import unicorn_Enviornment_Setup.Unicorn_Config;

public class Mouse_KeyBoard_Actions extends Unicorn_Config{
	static WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public static void clickWebElement(WebElement element) {
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
   }
	
	public static void sendKeysToElement(WebElement element, String inputData) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(inputData);
    }

}
