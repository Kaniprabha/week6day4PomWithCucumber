package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethod{
	
   
    @Then("Verify Create Lead is successfull")
    public ViewLeadPage verifyCreateLead() {
		String ViewLeadtitle = driver.getTitle();
		System.out.println("ViewLead Page title: "+ ViewLeadtitle);
		return this;
	}
    @Then("Get the lead id")
	public ViewLeadPage retriveLeadId() {
		String Id = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("LeadID: "+Id);
		return this;
	}
    

}
