package tditsolutions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.control.Alert;

public class AddSecurity {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://spglobalsolutions.in/tool2/add_security.php");
		
		
		  driver.findElement(By.xpath("//input[@id='snumber']")).sendKeys("11764356");
		
		  driver.findElement(By.xpath("//input[@id='isin']")).sendKeys("1245bn4356");
		
		  driver.findElement(By.xpath("//input[@id='sedol']")).sendKeys("76435765");
		
		  driver.findElement(By.xpath("//input[@value='s']")).click();
		  
		  driver.findElement(By.xpath("//input[@id='launch_date']")).sendKeys("20/05/2025");
		  
		  driver.findElement(By.xpath("//input[@id='value per share']")).sendKeys("7");
		  
		  driver.findElement(By.xpath("//textarea[@id='summary']")).sendKeys("your shares");
		  
		  WebDriverWait wait=new WebDriverWait(driver,5);
		  
		  driver.findElement(By.xpath("//button[@name='register']")).click();
		  
		  
		  String alertmsg= driver.switchTo().alert().getText();
		 
		  wait.until(ExpectedConditions.alertIsPresent());
		  
		  String expectedmsg=  "Security Registered.. ";
		  
		  Assert.assertEquals(alertmsg, expectedmsg);
		  
		  
		  
	}

}
