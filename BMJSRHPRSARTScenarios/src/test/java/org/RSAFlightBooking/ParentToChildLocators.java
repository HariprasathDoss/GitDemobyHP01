package org.RSAFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentToChildLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement fromBtn = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		fromBtn.click();
        
		WebElement fromPToChild = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@text='Chennai (MAA)']"));
		fromPToChild.click();
		
		Thread.sleep(2000);
		
		WebElement toPtoChild = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"));
		toPtoChild.click();
		
		
		
	}

}
