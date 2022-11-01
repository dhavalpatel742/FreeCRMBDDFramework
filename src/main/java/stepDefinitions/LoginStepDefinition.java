//package stepDefinitions;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import junit.framework.*;
//
//
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new PendingException();
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
//		driver = new ChromeDriver();
//		//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
//		//driver = new FirefoxDriver();
//		driver.get("https://ui.freecrm.com/");
//	}
//
//	@When("^title of login page is Cogmento CRM$")
//	public void title_of_login_page_is_Cogmento_CRM() {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new PendingException();
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM",title);
//		
//	}
//
//	//Reg Exp:
//	//1. \"([^\"]*)\"
//	//2. \"(.*)\"
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username , String password) {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new PendingException();
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new PendingException();
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new PendingException();
//		Thread.sleep(3000);
//		String username = driver.findElement(By.className("user-display")).getText();
//		Assert.assertEquals("dhaval patel", username);
//	}
//	
//	@Then("^user move to new contact page$")
//	public void user_move_to_new_contact_page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//i[@class='users icon']")).click();
//	    
//	}
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"")
//	public void user_enters_contact_details(String firstname, String lastname, String position) throws InterruptedException {
//		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.name("first_name")).sendKeys(firstname);
//		Thread.sleep(1000);
//		driver.findElement(By.name("last_name")).sendKeys(lastname);
//		Thread.sleep(1000);
//		driver.findElement(By.name("position")).sendKeys(position);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//		Thread.sleep(3000);
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
