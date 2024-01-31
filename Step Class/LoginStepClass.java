package org.step;

import org.basee.BaseClassJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomoct2023.LoginPageClass;

public class LoginStepClass extends BaseClassJava{
	public static LoginPageClass pomoct2023;
	@Given("User should be in Login Page")
	public void tc01() {
		try {
			getDriver("Edge");
			getUrl("https://adactinhotelapp.com/");
			System.out.println("User should be in Login Page");
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
	}

	@When("User should Enter Username and Password")
	public void tc02() {
		 try {
			 pomoct2023 =new LoginPageClass();
				WebElement username = pomoct2023.getUsername();
				username.sendKeys("saranmasskr");
				WebElement password = pomoct2023.getPassword();
				password.sendKeys("krsaran@143");
				 System.out.println("User should Enter Username and Password");
		} catch (Exception e) {
			
		}
	  
	}

	@When("User should Click Login button")
	public void tc03() {
		try {
			pomoct2023 =new LoginPageClass();
			WebElement login = pomoct2023.getLogin();
			login.click();
			  System.out.println("User successfully  Clicked the Login button");
		} catch (Exception e) {
			
		}
	 
	}

	@Then("User should verify the Login successful meassage")
	public void tc04() {
		  try {
		      WebElement SearchHotel = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));
		      if (SearchHotel.isDisplayed()) {
				System.out.println("Login Successfully Happen"+SearchHotel.getText()+"_ElementPresent");
			} else {
				System.out.println("Login Not Successfully Happen"+SearchHotel.getText()+"_Element Not Present");
			}
		      
			  }catch (Exception e) {
				
			
			 
			}

	}
}
