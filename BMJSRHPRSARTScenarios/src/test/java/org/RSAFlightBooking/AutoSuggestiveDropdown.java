package org.RSAFlightBooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
        WebElement autoSuggest = driver.findElement(By.id("autosuggest"));
        autoSuggest.sendKeys("ind");
        
        List<WebElement> grabOptions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
        for (WebElement option : grabOptions) {
        	if(option.getText().equalsIgnoreCase("India")) {
            	
        		option.click();
     
        	System.out.println(option.getText());
        	System.out.println("end");
        	}
	
        }
       
	}

}
