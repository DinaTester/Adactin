package com.stepdef;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Step_Definition {
	public static WebDriver driver=new ChromeDriver();
	
	@Before
	private void before() {
    System.out.println("SCENARIO IS GETTING STARTED");
	}
	
	@After
	private void after() {
    System.out.println("END");
	}

	
	@Given("Launch the URL")
	public void launch_the_url() {
	    driver.get("https://adactinhotelapp.com/");
	}
	
	@When("Enter the {string} in the username field")
	public void enter_the_in_the_username_field(String string) {
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys(string);
	}
	@When("Enter the {string} in the password field")
	public void enter_the_in_the_password_field(String string) {
		WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys(string);
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
	 WebElement login = driver.findElement(By.id("login"));
	 login.click();
	}
	@Then("User should navigate to the Search hotels page")
	public void user_should_navigate_to_the_search_hotels_page() {
	    String title = driver.getTitle();
	    String t="Adactin.com - Search Hotel";
	    Assert.assertEquals(t, title);
	}



}
