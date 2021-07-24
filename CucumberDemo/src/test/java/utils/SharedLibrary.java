package utils;

import org.openqa.selenium.WebElement;

public class SharedLibrary {

	public void enterText(WebElement elem, String text) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		elem.sendKeys(text);
	}
	
	public void click(WebElement elem) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		elem.click();
	}
	
	public void displayText(WebElement elem) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		elem.isDisplayed();
	}
}
