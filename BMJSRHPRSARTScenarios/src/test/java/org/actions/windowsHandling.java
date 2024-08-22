package org.actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
	    Set<String> windows = driver.getWindowHandles();
	    Iterator<String> it = windows.iterator();
	    String parentID = it.next();
	    String childID= it.next();
	    driver.switchTo().window(childID);
	    System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
	    driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
	    String childWindowEmailId = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
	    System.out.println(childWindowEmailId);
	    driver.switchTo().window(parentID);
	    driver.findElement(By.cssSelector("input[id=username]")).sendKeys(childWindowEmailId);
	    
	    
	    //mentor@rahulshettyacademy.com
	    
	}

}
