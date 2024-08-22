package org.RSAFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalendarUI {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	    WebElement roundTripClick =  driver.findElement(By.cssSelector("td input[value='RoundTrip']"));
	    roundTripClick.click();
	    Thread.sleep(2000);
	    WebElement fromClick = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
	    fromClick.click();
	    WebElement fromCitydest = driver.findElement(By.xpath("//a[@value='MAA']"));
	    fromCitydest.click();
	    WebElement toCitydest =  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"));
	    toCitydest.click();
	    
	    Thread.sleep(2000);
	    WebElement calendarOne = driver.findElement(By.cssSelector("ui-state-default ui-state-highlight"));
	    calendarOne.click();
	}

}
