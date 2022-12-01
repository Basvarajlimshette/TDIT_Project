package tdit.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementutil {

	WebDriver driver;

	public Elementutil(WebDriver driver) {
		this.driver = driver;
	}

	public void EneterText(By locator, String text) {

		System.out.println("Inside enterText ");
		System.out.println("Locator: " + locator);
		System.out.println("Text: " + text);
		driver.findElement(locator).sendKeys(text);
	}

	public String getText(By locator) {

		System.out.println("Inside getText ");
		System.out.println("Locator: " + locator);
		String text = driver.findElement(locator).getText();
		System.out.println("Text Present for Element : " + text);
		return text;
	}

	public String getText(WebElement element) {
		System.out.println("Inside getText with Element");
		String str = element.getText();
		System.out.println("Text Present for Element : " + str);
		return str;
	}

	public void click(By locator) {

		System.out.println("Inside click Method ");
		System.out.println("Locator: " + locator);
		driver.findElement(locator).click();
		System.out.println("Clicked on Element");
	}



	public String getAttributevalue(By locator, String attributename) {

		System.out.println("Inside getAttributeValue : ");
		System.out.println("Locator : " + locator);
		System.out.println("Attribute Name: " + attributename);
		String value = driver.findElement(locator).getAttribute(attributename);
		System.out.println("Attribute Value : " + value);
		return value;
	}

	
	

	public void scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	
	
	
	
	
	//wait  methods
	
	public boolean waitforAlert() {

		WebDriverWait wait = new WebDriverWait(driver,5);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public void waitforElement(By locator) {
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	
	
	

}
