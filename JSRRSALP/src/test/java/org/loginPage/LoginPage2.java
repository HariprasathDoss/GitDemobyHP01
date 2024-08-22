package org.loginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "Hariprasath HP02";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    String password = getPassword(driver);
		WebElement idInfo = driver.findElement(By.id("inputUsername"));
		idInfo.sendKeys(name);
		WebElement passInfo = driver.findElement(By.name("inputPassword"));
		passInfo.sendKeys(password);
		Thread.sleep(2000);
		WebElement chkboxOne =	driver.findElement(By.cssSelector("input#chkboxOne"));
		chkboxOne.click();
	    WebElement chkboxTwo = driver.findElement(By.cssSelector("input#chkboxTwo"));
		chkboxTwo.click();
	   // Signinbtn by xpath contains 
		WebElement signInbtnClk = driver.findElement(By.xpath("//button[contains(@class,'signIn')]"));
	    signInbtnClk.click();
	    Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Hello "+name+ ",");
        System.out.println(driver.findElement(By.xpath("//h2")).getText());
        System.out.println(driver.findElement(By.tagName("p")).getText());
        WebElement logOut =  driver.findElement(By.cssSelector("button.logout-btn"));
        logOut.click();
        driver.quit();

        
        	
	}
	
	 public static String getPassword(WebDriver driver){
		 //   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//	driver.manage().window().maximize();
		    WebElement forgotPassword =	driver.findElement(By.xpath("//div /a"));
		    forgotPassword.click();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		    WebElement resetLoginBtn = driver.findElement(By.cssSelector("button[class='reset-pwd-btn']"));
		    resetLoginBtn.click();
		    String passwordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		    System.out.println(passwordText);
		    WebElement gtLClk = driver.findElement(By.cssSelector("button.go-to-login-btn"));
		    gtLClk.click();
		    String[] passwordArray = passwordText.split("'");
		 //System.out.println(passwordArray);
		//System.out.println(passwordArray);
		    
		   String password =  passwordArray[1].split("'")[0];
		   System.out.println(password);
		   return password;
		     
     }

    

}
