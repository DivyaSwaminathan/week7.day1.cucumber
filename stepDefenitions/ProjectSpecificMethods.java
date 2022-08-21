package stepDefenitions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void seetup() {
		launchBrowser();
		loadtheURLandMaximize();
	}
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		
	
	}
	public void loadtheURLandMaximize() {
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
