package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;

public class WelcomePage extends ProjectSpecificMethod{
	
	
	
	@And("Click on the crmsfa")
	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(); 
	}
	
    /*public WelcomePage clickLogoutButton() {
    	System.out.println("Logout Successfull");
    	return this;
		
	} 
    public WelcomePage verifyLoginPage() {
    	System.out.println("Login Successful");
    	return this;
    }*/
//<class name="testcases.LoginLogOutTC_002"/>
	
}
