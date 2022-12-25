package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulationStep {
	WebDriver driver;
	
	@Given("User want to open Worldometers.info")
	public void user_want_to_open_worldometers_info() throws InterruptedException {
		
		
		System.out.println("dfghjklghjkl844");
	   WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver ();
		//driver.get("https://www.worldometers.info");
	
		//WebDriverManager.chromedriver().setup();
        //C:\MyDriver\chromedriver_win32
		//System.setProperty("webdriver.chrome.driver", "C://MyDriver//chromedriver_win32//chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         Thread.sleep(5000);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//driver.get("https://www.worldometers.info");
		
		  System.out.println("1. User open URL...");
		
	}

	@When("User will get World current Population")
	public void user_will_get_world_current_population() {
	    
		  System.out.println("2. User open URL...");
		
	}

	@And("User will get Today world Population")
	public void user_will_get_today_world_population() {
		  System.out.println("3. User open URL...");
		
		
	}

	@And("User will get This Year World Population")
	public void user_will_get_this_year_world_population() {
	
		  System.out.println("4. User open URL...");
	}

	@Then("User will check current population growth per second")
	public void user_will_check_current_population_growth_per_second() {
		  System.out.println("5. User open URL...");
		
	}

	@And("check the Page Title")
	public void check_the_page_title() {
		  System.out.println("6. User open URL...");
		
	}

}
	