package stepDefenitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class EditLeadsPage extends ProjectSpecificMethods{
	@Given ("click link CRM_SFA for Edit")
	public void clickCRM_SFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
			
		}
	@And ("click Leads tab for Edit")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
		
	
	@And ("click Find leads tab")
	public void findLeadsTab() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When ("Enter firstname as (.*)$")
	public void typeFirstname(String firstname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstname);
	}
	@And ("click find leads button")
	public void clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		Thread.sleep(500);
	}
	@And ("click firstresulting leadID from the results")
	public void clickResult() {
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
	}
	@And ("click Edit button")
	public void clickEdit() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(500);
	}
	@And ("change the companyname as (.*)$")
	public void editCompanyName(String companyName) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyName);
	}
	@And ("click update button")
	public void clickUpdateButton() {
		driver.findElement(By.xpath("//input[@Value='Update']")).click();
	}
	@Then ("Verify lead is edited with companyName as (.*)$")
	public void verifyViewLeadPageDisplayed(String companyName) {
		String newName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(newName);
		if(newName.contains(companyName)) {
			System.out.println("Edit lead is successful");}
		else {
			System.out.println("unable to update company name");
		}
	}
}
