package stepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadsPage extends ProjectSpecificMethods{

	@Given ("click link CRM_SFA")
		public void clickCRM_SFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
			
		}
	@And("click Leads tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And ("click create leads tab")
	public void createLeadsTab() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When ("Type companyname as (.*)$")
	public void typeCompanyName(String companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}
	@And ("Type firstname as (.*)$")
	public void typeFirstname(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname,Keys.TAB,"Swaminathan");
	}
	@And ("Type email as (.*)$")
	public void typeEmail(String email) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}
	@And ("click create leads button")
	public void clickCreateLeadsButton() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then ("Verify view lead page is loaded")
	public void verifyViewLeadPage() {
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println("Create Lead is Successful");
	}

	
	}
}
