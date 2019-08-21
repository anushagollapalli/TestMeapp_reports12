package cucumber_new_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class mytest999 {
	WebDriver driver;

@Given("TestMe is up and running")
public void testme_is_up_and_running() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("registered user enters valid credentials")

public void registered_user_enters_valid_credentials() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	driver.findElement(By.name("userName")).sendKeys("Lalitha");
	driver.findElement(By.name("password")).sendKeys("Password123");
	driver.findElement(By.name("Login")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("verifies for login")
public void verifies_for_login() {
String actual="SignOut";
	
	String expected=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
	 System.out.println(expected);
	
	 Assert.assertEquals(expected,actual);
	 driver.findElement(By.xpath("//*[@id=\\\"header\\\"]/div[1]/div/div/div[2]/div/ul/a")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

}
