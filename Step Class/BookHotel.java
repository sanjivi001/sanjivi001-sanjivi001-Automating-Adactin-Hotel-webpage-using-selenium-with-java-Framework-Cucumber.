package org.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.basee.BaseClassJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class BookHotel extends BaseClassJava {
	@Then("User should Enter the Book Hotel Page")
	public void tc03() throws AWTException, InterruptedException {
		Robot r=new Robot();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		
		firstname.sendKeys("saranmasskr");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("krsaran@123");
		
		WebElement info = driver.findElement(By.name("address"));
		
		info.sendKeys("no:6 VengateshwararNagar,Madagadipet,Puducherry");
		
		WebElement creditcard = driver.findElement(By.id("cc_num"));
		
		creditcard.sendKeys("1234567890987654");
		
	Thread.sleep(2000);	
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		
		cardtype.click();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	Thread.sleep(2000);	
		
	    WebElement cardexpirymonth = driver.findElement(By.id("cc_exp_month"));
		
		cardexpirymonth.click();
		
		for (int i = 0; i < 6; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	
		}	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	Thread.sleep(2000);	
		
		
		WebElement cardexpiryyear = driver.findElement(By.id("cc_exp_year"));
		
		cardexpiryyear.click();
		
		
		for (int i = 0; i < 15; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	
		}	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	Thread.sleep(2000);	
		
		WebElement cvvnumber = driver.findElement(By.id("cc_cvv"));
		
		cvvnumber.sendKeys("200");
		
	Thread.sleep(2000);
		
		WebElement book = driver.findElement(By.name("book_now"));
		
		book.click();
		
		
	}

}
