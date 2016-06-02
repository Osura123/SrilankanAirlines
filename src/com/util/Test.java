package com.util;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.homepage.homePage;
import com.joinnowpage.Joinnowpage;
import com.page2.Page2;

public class Test {
	static WebDriver webDriver;
	static homePage homepage;
	static Page2 page2;
	static Joinnowpage joinnowpage;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		webDriver=new FirefoxDriver();
		homepage=new homePage();
		page2=new Page2();
		joinnowpage=new Joinnowpage();
		
		webDriver.get("http://www.srilankan.com/");
		homepage.pageverificaton(webDriver);
		homepage.VerificationExpolrebtnDropdow(webDriver);
		Thread.sleep(2000);
		page2.verficationPage2(webDriver);
		Thread.sleep(2000);
		page2.verificationLanguage(webDriver);
		System.out.println("end2");
		page2.login(webDriver);
		Thread.sleep(10000);
		
		
		
		
		joinnowpage.verificationjoinNowPage(webDriver);
		joinnowpage.verificationradiobtn(webDriver);
	}

}
