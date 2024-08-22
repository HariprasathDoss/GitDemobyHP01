package org.loginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		WebElement idInfo = driver.findElement(By.id("inputUsername"));
		idInfo.sendKeys("1stTimeValidation");
		WebElement passInfo = driver.findElement(By.name("inputPassword"));
		passInfo.sendKeys("Hari1234");
		WebElement loginBtn= driver.findElement(By.className("submit"));
		loginBtn.click();
		
		//getting wrong credentials msg by css locator
		//css  for classname standard = tagname.classname
		//css for id standard = tagname#id
	//	Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement wrongCredMsg = driver.findElement(By.cssSelector("p.error"));
		System.out.println(wrongCredMsg.getText());
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		forgotPassword.click();
		WebElement fpName = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		fpName.sendKeys("Harish");
		
		// xpath from parent to child
		WebElement parenttoChildtraverseFPName = driver.findElement(By.xpath("//form/input[@placeholder='Name']"));
		parenttoChildtraverseFPName.clear();
		
		// css from parent to child
		WebElement fpNameCssIndex = driver.findElement(By.cssSelector("input[type='text']:nth-child(2)"));
		fpNameCssIndex.sendKeys("Hariprasath Doss");
		
		WebElement fpEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		fpEmail.sendKeys("hari02cskma@gmail.com");
		
		WebElement fpPhoneNumber = driver.findElement(By.cssSelector("input[placeholder='Phone Number']"));
		fpPhoneNumber.sendKeys("9003803524");
		fpPhoneNumber.clear();
		WebElement fpPhoneNoIndex = driver.findElement(By.xpath("//input[@type='text'][3]"));
		fpPhoneNoIndex.sendKeys("9344807444");
		
		WebElement resetLogin = driver.findElement(By.cssSelector("button.reset-pwd-btn"));
		resetLogin.click();
		
		//css Parent to child traverse
		WebElement passIncorrectMsg = driver.findElement(By.cssSelector("form p.infoMsg"));
		System.out.println(passIncorrectMsg.getText());
		
		// back to login screen by GO to LOgin button
		
		WebElement goToLogin = driver.findElement(By.cssSelector("div button:nth-child(1)"));
		goToLogin.click();
		
		// again entering login credentials
		WebElement userName = driver.findElement(By.cssSelector("input#inputUsername"));
		userName.sendKeys("Hariprasath HP02");
		
		// css selector regular expression syntax if any of word is dynamic- we can go with regular expression 
		WebElement password = driver.findElement(By.cssSelector("input[type*='pass']"));
		password.sendKeys("rahulshettyacademy");
		
	    WebElement chkboxOne =	driver.findElement(By.cssSelector("input#chkboxOne"));
	    chkboxOne.click();
	    
	    WebElement chkboxTwo = driver.findElement(By.cssSelector("input#chkboxTwo"));
	    chkboxTwo.click();
		
		// Signinbtn by xpath contains 
		
	    WebElement signInbtnClk = driver.findElement(By.xpath("//button[contains(@class,'signIn')]"));
	    signInbtnClk.click();
		
		
		
		
		
		
		
		
	}

}
