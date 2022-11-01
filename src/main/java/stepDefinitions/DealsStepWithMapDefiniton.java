//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsStepWithMapDefiniton {
//	
//WebDriver driver;
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
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new PendingException();
//		for(Map<String, String> data : credentials.asMaps(String.class, String.class)){
//		driver.findElement(By.name("email")).sendKeys(data.get("username"));
//		driver.findElement(By.name("password")).sendKeys(data.get("password"));
//		}
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
//	@Then("^user move to new deal page$")
//	public void user_move_to_new_deal_page() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//i[@class='money icon']")).click();
//	    
//	}
//	
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable dealData) throws InterruptedException {
//		for(Map<String, String> dealValues : dealData.asMaps(String.class, String.class)){
//		driver.findElement(By.xpath("//i[@class='money icon']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
//	   Thread.sleep(2000);
//	   driver.findElement(By.name("title")).sendKeys(dealValues.get("title"));
//	   Thread.sleep(1000);
//	   driver.findElement(By.name("amount")).sendKeys(dealValues.get("amount"));
//	   Thread.sleep(1000);
//	   driver.findElement(By.name("probability")).sendKeys(dealValues.get("probability"));
//	   Thread.sleep(1000);
//	   driver.findElement(By.name("commission")).sendKeys(dealValues.get("commission"));
//	   Thread.sleep(2000);
//	   driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//	   Thread.sleep(1000);
//		}
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
