package org.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentToChildToSiblingLocator {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Xpath from parent to child =  //header /div/button[1]
	    
		WebElement siblingToTraverse = driver.findElement(By.xpath("//header /div/button[1]/following-sibling::button[2]"));
		System.out.println(siblingToTraverse.getText());
		
		Thread.sleep(2000);
	    WebElement SiblingtoChildtoParent =	driver.findElement(By.xpath("//header /div/button[1]/parent::div/parent::header/div/button[1]"));
	    System.out.println(SiblingtoChildtoParent.getText());
	}

}
