package com.selenium.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyNewTest {
	
	@Test
	public void firstRunTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
        String USERNAME=System.getProperty("username");
        String PASSWORD=System.getProperty("password");
        
        System.out.println(URL);
        System.out.println(BROWSER);
        System.out.println(USERNAME);
        System.out.println(PASSWORD);
		System.out.println("First test run");
	}

	@Test
	public void secondRunTest() {
		System.out.println("Second test run");
	}
}
