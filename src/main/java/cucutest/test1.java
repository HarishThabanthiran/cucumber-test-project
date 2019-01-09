package cucutest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test1 {
	static WebDriver driver;
	@Given("The user is in the gurutelecom home page")
	public void the_user_is_in_the_gurutelecom_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\PC\\studies\\Programming\\Java eclipse\\Java_cucumber\\cucutest\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	}
	

	@Given("The user navigates to add customer page")
	public void the_user_navigates_to_add_customer_page() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user fill in the customer page")
	public void the_user_fill_in_the_customer_page() throws Throwable {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("Harish");
		driver.findElement(By.id("lname")).sendKeys("Thabanthiran");
		driver.findElement(By.id("email")).sendKeys("qweerr@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("chennkjkhjai");
		driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {
		
		Assert.assertEquals("Please Note Down Your CustomerID",driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']")).getText());
	   
	}

}
