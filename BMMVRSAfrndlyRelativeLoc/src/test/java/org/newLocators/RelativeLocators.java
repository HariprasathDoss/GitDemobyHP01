package org.newLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditBox = driver.findElement(By.name("name"));
        // relative locator by above element
        WebElement aboveRelLocator = driver.findElement(with(By.tagName("label")).above(nameEditBox));
        System.out.println(aboveRelLocator.getText());
       
     // relative locator by to left of element
        
        WebElement checkMe = driver.findElement(By.cssSelector("label.form-check-label"));
        driver.findElement(with(By.id("exampleCheck1")).toLeftOf(checkMe)).click();
        
// relative locator by bottom of element
        
        WebElement passEditBox = driver.findElement(By.id("exampleInputPassword1"));
        Thread.sleep(2000);
        WebElement passInfo = driver.findElement(with(By.cssSelector("input[placeholder='Password']")).below(passEditBox));
        passInfo.sendKeys("Hari");
        
     // relative locator by to right of element
        
        WebElement EmpStatus= driver.findElement(By.cssSelector("label[for='exampleFormControlRadio1']"));
        driver.findElement(with(By.id("inlineRadio2")).toRightOf(EmpStatus)).click();
        
        
        
        
        // relative locator by below element
        
   //     WebElement DOBEditBox = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
    //    driver.findElement(with(By.xpath("//input[@class='form-control']")).below(DOBEditBox)).click();
     //   Thread.sleep(2000);
      //  DOBEditBox.sendKeys("20022002");
        
        		//(By.tagName("label")).above(nameEditBox)).getText();
	//	driver.findElement(RelativeLocators.withTagName("li")).

	}

}
