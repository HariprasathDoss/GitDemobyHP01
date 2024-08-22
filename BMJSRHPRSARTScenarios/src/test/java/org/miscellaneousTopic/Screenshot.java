package org.miscellaneousTopic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// if we want to take a screenshot have to convert webdriver object to screenshot object
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("iphone");
		Thread.sleep(2000);
		search.click();
	    File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\Users\\rthiv\\screenshot.png"));
	    
	    driver.quit();
		
		
	}

}
