package org.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.basee.BaseClassJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class SearchHotel extends BaseClassJava {
	@Then("User should Select Hotel Location,Hotels,Roomtypes")
	public void tc01() throws AWTException, InterruptedException {
		WebElement location = driver.findElement(By.name("location"));
		location.click();
		
//		a.contextClick(location).build().perform();
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);	
		WebElement hotel = driver.findElement(By.id("hotels"));
		
		hotel.click();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);	
		WebElement roomtype = driver.findElement(By.id("room_type"));
		
		roomtype.click();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);	
		WebElement noofroom = driver.findElement(By.id("room_nos"));
		
		noofroom.click();
		
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	
		}	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);	
		WebElement checkindate = driver.findElement(By.name("datepick_in"));
		
		checkindate.clear();
		checkindate.sendKeys("29/10/2023");
	Thread.sleep(2000);	
		WebElement checkoutdate = driver.findElement(By.name("datepick_out"));
		
		checkoutdate.clear();
		checkoutdate.sendKeys("5/11/2023");
	Thread.sleep(2000);	
		
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		
		adultroom.click();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	Thread.sleep(2000);	
		
		WebElement childroom = driver.findElement(By.id("child_room"));
		
		childroom.click();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	Thread.sleep(2000);	
		
		WebElement search = driver.findElement(By.id("Submit"));
		
		search.click();
	}
}