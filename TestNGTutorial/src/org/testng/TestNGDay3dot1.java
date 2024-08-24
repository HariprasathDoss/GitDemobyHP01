package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDay3dot1 {
	
	@Test
	public void WebLoginHomeLoan() {
		
		System.out.println("webloginHomeloan");
	}
	
	@Test@Parameters({"URL"})
	public void MobileLoginHomeLoan() {
		
		System.out.println("MobileHomeLoan");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		
		System.out.println("LoginAPIHomeLoan");
	}
	
}
