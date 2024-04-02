package gustasi_home;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class cucumbertest {
	
	
	    private AppiumDriver driver;

	    @Before
	    public void setUp() throws Exception {
	    	UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Android Emulator");
			//DesiredCapabilities capabilities = new DesiredCapabilities();
	        options.setCapability("platformName", "Android");
	        options.setCapability("deviceName", "Android Emulator");
			options.setApp("//Users//konalakshmanarao//eclipse-workspace//Android_gustasi//src//test//java//appstore//prod-app3105.apk");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);	
			Thread.sleep(5000);
	
	    }

	    @Given("User opens the Gustasi_application")
	    public void User_open_the_Gustasi_application() throws InterruptedException {
	    	
	    	driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			
			
	    }
	    @When("user clicks on the Account icon")
	    public void user_clicks_on_the_Account_icon() throws Throwable {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//android.view.View[@content-desc=\"person circle outline Account\"]")).click();
			Thread.sleep(2000);
	    }

	    @When("user enters the mobile number")
	    public void user_enters_the_mobile_number(String string) throws Throwable {
	    	driver.findElement(By.xpath("//android.view.View[@resource-id=\"mainbody\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("9032777886");
			Thread.sleep(2000);
	    }

	    @When("User enters the password")
	    public void user_enters_the_password(String string) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	driver.findElement(By.xpath("//android.view.View[@resource-id=\"mainbody\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("Laxman@1438");
			Thread.sleep(2000);
	    }

	    @When("user clicks on the login button")
	    public void user_clicks_on_the_login_button() throws Throwable {
	    	driver.findElement(By.xpath("//android.widget.Button[@text=\"LOGIN\"]")).click();
			Thread.sleep(1000);
	    }

	    @Then("Verify the user account name")
	    public void verify_the_user_account_name() throws Throwable {
	    	driver.findElement(By.xpath("//android.view.View[@content-desc=\"menu outline Settings\"]")).click();
			Thread.sleep(2000);
			String data=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lakshman guest\"]")).getText();
			System.out.println(data);
	    }



	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


