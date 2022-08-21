package stepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends ProjectSpecificMethods{
	
	@Given ("Type the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And ("Type the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@When ("click on login button")
	public void clickLogin(){
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("verify application home page is loaded")
	public void verify_application_home_page_is_loaded() {
		String value = driver.findElement(By.tagName("h2")).getText();
		if (value.contains("Welcome")) {
			System.out.println("Successfully logged in to application");
		}
	}
	@But("The error message should be displayed")
	public void the_error_message_should_be_displayed() {
		String failMsg = driver.findElement(By.xpath("//div[@id='errorDiv']/p")).getText();
		if (failMsg.contains("The Following Errors Occurred")) {
			System.out.println("the login has failed");
		}
	}

}
