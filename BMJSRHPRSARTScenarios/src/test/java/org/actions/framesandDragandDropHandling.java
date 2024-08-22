package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesandDragandDropHandling {

	public static void main(String[] args) {
		
// Frames are the component this is also a part of web page but context is stored in the independent specific container and ability to load content independently.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		// Executing frames with help of WebElement
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		// Executing frames with help of int 
	    System.out.println(driver.findElement(By.tagName("iframe")));
	     driver.switchTo().frame(0);
		Actions a = new Actions(driver);
		WebElement sourceDrag = driver.findElement(By.id("draggable"));
		WebElement sourceDrop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(sourceDrag, sourceDrop).build().perform();
		
		// once done all our action stuff we have to came back in default content then only we can do normal operations
		
		driver.switchTo().defaultContent();
		
		
	}

}
