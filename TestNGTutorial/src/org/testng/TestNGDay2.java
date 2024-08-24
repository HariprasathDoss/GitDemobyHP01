package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDay2 {
	@Parameters({"URL","APIKey"})
	@Test
	public void personalLoan(String url, String key)
	{
		System.out.println("7%");
	}
}
