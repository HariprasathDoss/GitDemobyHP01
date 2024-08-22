package org.RSAEcommerce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingMultipleItemsToCartbyArray {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String [] multipleData = {"Cucumber ", "Brocolli ", "Carrot ","Beans " };
		List<WebElement> products  = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		
		
		for (int i = 0; i <products.size(); i++) {
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List al = Arrays.asList(multipleData);
			
			int j=0;
			if(al.contains(formattedName))
			{
				
				j++;
				
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==multipleData.length)
			{
				break;
			}
			
			}
			
			
		}
		
		
	}
		
		
		
	}


