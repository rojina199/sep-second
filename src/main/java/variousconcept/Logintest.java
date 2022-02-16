package variousconcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Logintest {
	
	WebDriver driver;
	@Before
	 public void init() {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe ");
		 driver= new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get("https://techfios.com/billing/?ng=admin/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}
		 @Test
		public void LoginTest() {
			// Storing  Webelement Using Webelement class
			//Type name = value
			WebElement userNameElement=driver.findElement(By.xpath("//input[@id=\"username\"]"));
			WebElement passwordElement=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement signInButtonElement=	driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
			
			
			By.xpath("//input[@id=\"username\"]");
		  By.xpath("//input[@id=\"username\"]");
		  By signInButtonLocator=By.xpath("(\"/html/body/div/div/div/form/div[3]/button\"))");
		By DashboardHeadLocator=By.xpath("//h2[ contains(text(),' Dashboard ')]");

			userNameElement.clear();
			userNameElement.sendKeys("demo@techfios.com");
			passwordElement.sendKeys("abc123");
			//signInButtonElement.click();
			driver.findElement(signInButtonLocator).click();
			
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
	
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(DashboardHeadLocator));
	 userNameElement = driver.findElement(By.xpath("//h2[ contains(text(),' Dashboard ')]"));
			
		 }	
			
		@After
	  public void tearDown() {
		  driver.close();
		  driver.quit();
		  
}
}