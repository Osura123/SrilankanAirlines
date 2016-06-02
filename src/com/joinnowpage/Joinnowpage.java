package com.joinnowpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Joinnowpage {
public void verificationjoinNowPage(WebDriver webDriver){
	Assert.assertEquals("https://www.flysmiles.com/home/register",webDriver.getCurrentUrl());
	Assert.assertEquals("Join Now",webDriver.getTitle());
}
public void verificationradiobtn(WebDriver webDriver){
	WebElement no=(WebElement)webDriver.findElement(By.id("rdmemno"));
	Assert.assertEquals(true, no.isSelected());
	WebElement ul=(WebElement)webDriver.findElement(By.id("txtusernamerg"));
	Assert.assertEquals(false, ul.isEnabled());
}

}
