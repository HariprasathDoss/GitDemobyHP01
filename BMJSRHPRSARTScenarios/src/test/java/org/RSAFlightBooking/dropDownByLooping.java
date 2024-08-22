package org.RSAFlightBooking;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownByLooping {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		WebElement passengerBtn = driver.findElement(By.cssSelector("div.paxinfo"));
		passengerBtn.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// while loop scenario
		int i = 1;
		while(i<=4)
		{
			driver.findElement(By.cssSelector("[id='hrefIncAdt']")).click();
			i++;
		}
		
		for (int j = 0; j < 3; j++) {
			
			driver.findElement(By.id("hrefIncChd")).click();
			
		}
		
		/*
		 * Thread.sleep(3000); for (int i1 = 0; i1 >2; i1--) {
		 * driver.findElement(By.cssSelector("[id='divpaxinfo']")).click();
		 * 
		 * }
		 */
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
	//	System.out.println(driver.findElement(By.cssSelector("[id='hrefIncAdt']")).getText());

		driver.quit();
		System.out.println("success");
	}
	
	
	

}
