package org.Links;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calculateLinksPageInFooter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
	    WebElement footers =	driver.findElement(By.id("gf-BIG"));
	    // Limiting  the scope of links from global to footer level by finding the footer element
		System.out.println(footers.findElements(By.tagName("a")).size());
		
		// Limiting  the scope of links from footer level to first column level by finding the footer element
		WebElement firstColumnLink = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(firstColumnLink.findElements(By.tagName("a")).size());
		
		// click on each link on column and check if the pages are opening or not
		for (int i = 1; i <firstColumnLink.findElements(By.tagName("a")).size(); i++) 
		{
			String clinkingLinkOnDiffTabs  = Keys.chord(Keys.CONTROL,Keys.ENTER);
			firstColumnLink.findElements(By.tagName("a")).get(i).sendKeys(clinkingLinkOnDiffTabs);
		}	
			Set <String> abc =driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
		
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
		
	   // driver.quit();
	    

	}

