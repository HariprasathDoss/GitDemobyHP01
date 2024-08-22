package org.RSAFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement fromBtn = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		fromBtn.click();
		
		WebElement fromDD = driver.findElement(By.xpath("//a[@text='Chennai (MAA)']"));
	    fromDD.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement toDD = driver.findElement(By.xpath("(//a[@value='DEL'])[2]"));
	    toDD.click();
	   
	    driver.quit();
	}

}
