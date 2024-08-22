package org.RSAFlightBooking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdownScenario {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement CurrencyDropDownbtn = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		
		// Static selecting by index
		
		Select staticDropdown = new Select(CurrencyDropDownbtn);
		staticDropdown.selectByIndex(1);
		System.out.println(staticDropdown.getFirstSelectedOption().getText());

		// Static selecting by Value
		
		Thread.sleep(2000);
		staticDropdown.selectByValue("AED");
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		
		// Static selecting by VisibleText
		
		staticDropdown.selectByVisibleText("USD");
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		
		driver.quit();
		
	}
}
