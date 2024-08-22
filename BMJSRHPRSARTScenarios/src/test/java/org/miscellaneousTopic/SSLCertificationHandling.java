package org.miscellaneousTopic;

import java.lang.foreign.Linker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificationHandling {

	public static void main(String[] args) {
		// ChromeOptions which set behaviour of chrome browser
		
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://expired.badssi.com/");
		System.out.println(driver.getTitle());
	}

}
