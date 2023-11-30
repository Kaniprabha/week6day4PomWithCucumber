package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod{

	
	@Given("Enter the username")
	public LoginPage enterUserName() {
		System.out.println("LoginPage: "+ driver);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	@And("Enter the password")
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	@When("Click on the Login button")
    public WelcomePage clickLoginButton() {
    	driver.findElement(By.className("decorativeSubmit")).click();
    	return new WelcomePage();    	
	}
   
}
