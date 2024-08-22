package org.newLocators;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokMultiWindowsTabsandPartialSShot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		// Helps to achieve Multi Tasking - when we need to grab a information from different tab we can use this newWindow method to achieve this think
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId= it.next();
	    String childWindowID =it.next();
	    driver.switchTo().window(childWindowID);
	    driver.get("https://rahulshettyacademy.com/");
	    String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(7).getText();
	    driver.switchTo().window(parentWindowId);
	    Thread.sleep(2000);
	    WebElement name =driver.findElement(By.name("name"));
	    name.sendKeys(courseName);
	    System.out.println("success");
	    File file = name.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("logo.png"));
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}

}
