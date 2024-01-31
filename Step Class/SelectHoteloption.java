package org.step;

import org.basee.BaseClassJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class SelectHoteloption extends BaseClassJava{

	@Then("User should select Hotel Based given search")
	public void tc02() {
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@name='radiobutton_1'][1]"));
		radiobutton.click();
		
		WebElement confirm = driver.findElement(By.name("continue"));
		
		confirm.click();
		
	}
}