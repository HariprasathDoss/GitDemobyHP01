package org.RSAFlightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxScenario {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).isSelected());
        driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("div[id*='SeniorCitizenDiv']")).isSelected());
        
        // count the no. of checkboxes
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        driver.quit();
		
	}

}
