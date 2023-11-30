package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethod{
	
    
    @Given("Enter the company name")
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    	return this;
	}
    @Given("Enter the first name")
    public CreateLeadPage enterFirstName() {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
    	return this;
	}
    @Given("Enter the last name")
    public CreateLeadPage enterLastName() {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
    	return this;
    }
    @Given("Enter phnum")
    public CreateLeadPage enterPhno() {
    	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
    	return this;
    }
    @When("Click on the submit button")
    public ViewLeadPage clickSubmitButton() {
    	driver.findElement(By.name("submitButton")).click();
    	return new ViewLeadPage(); 
    }

}
