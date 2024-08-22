package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsClass {

	public static void main(String[] args) {
          
		 // actions class is specially designed for performing MouseOver, Keyboard interaction, Double click, context click and Drag and Dropping the element 
  
	WebDriverManager.chromedriver().setup(); 
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=12628378243221872917&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007812&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	driver.manage().window().maximize();
    Actions ac = new Actions(driver);
    WebElement movingTo = driver.findElement(By.id("nav-link-accountList"));
    ac.moveToElement(movingTo).contextClick().build().perform();
    ac.moveToElement(driver.findElement(By.xpath("//input[@autocomplete='off']"))).click().keyDown(Keys.SHIFT).sendKeys("google pixel pro").doubleClick().build().perform();
	
	}

}
