package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightFinder {

	WebDriver driver; 
	@Given("User in Website")
	public void user_in_Website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ziaha\\eclipse-workspace\\TestProject\\src\\main\\resources\\driver\\chromedriver.exe"); 
	    driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("http://www.newtours.demoaut.com/");	    
	    
	}
	
	@When("User Logs in")
	public void user_Logs_in() {
		 driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("selenium1994");
		 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("smarttech");
		 driver.findElement(By.xpath("//*[@name='login']")).click();
		 
	//	  Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
//		   driver.quit();		
	}
    

	@When("User select Round Trip")
	public void user_select_Round_Trip() {
		driver.findElement(By.xpath("//*[@value='roundtrip']")).click();
	}
    	

	@Then("Round Trip selected")
	public void round_Trip_selected() {
		WebElement roundTripBtn = driver.findElement(By.xpath("//*[@value='roundtrip']"));
	    System.out.println("Round Trip is Selected is "+roundTripBtn.isSelected());
	}

	@When("Users selects One Way")
	public void users_selects_One_Way() {
	   WebElement oneWayBtn = driver.findElement(By.xpath("//*[@value='oneway']"));
	   System.out.println("One Way is Selected "+oneWayBtn.isSelected());
	}
	
	@Then("One way is selected")
	public void one_way_is_selected() {
	    
	}

}
