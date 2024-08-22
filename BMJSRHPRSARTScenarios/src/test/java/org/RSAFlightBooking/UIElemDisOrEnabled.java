package org.RSAFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIElemDisOrEnabled {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();	
		
		//checking while before return date field is click 
		
		  WebElement ReturnDateFieldBeforeClicked = driver.findElement(By.id("Div1"));
		  System.out.println(ReturnDateFieldBeforeClicked.getAttribute("style"));
		  
		  //Return date field clicking xpath 
		  WebElement ReturnDateFieldClick = driver.findElement(By.id("ctl00_mainContent_view_date2"));
		  ReturnDateFieldClick.click();
		  
		  //checking while after return date field is click 
		  WebElement ReturnDateFieldAfterClicked = driver.findElement(By.id("Div1"));
		  System.out.println(ReturnDateFieldAfterClicked.getAttribute("style"));

		  if( driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		  {
			 System.out.println("its enabled");
			 
			 
		  }else
		  {
			  System.out.println("its disabled");
		  }
		  
		  
	}

}
