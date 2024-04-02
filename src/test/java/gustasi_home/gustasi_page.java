package gustasi_home;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class gustasi_page {
	AndroidDriver driver;
	

	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {
		
//		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
//				.withIPAddress("127.0.0.1").usingPort(4723).build();
//	service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Android Emulator");
		//DesiredCapabilities capabilities = new DesiredCapabilities();
        options.setCapability("platformName", "Android");
        options.setCapability("deviceName", "Android Emulator");
		options.setApp("//Users//konalakshmanarao//eclipse-workspace//Android_gustasi//src//test//java//appstore//prod-app3105.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);	
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		//driver.findElement(By.xpath("//android.widget.EditText")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"person circle outline Account\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@resource-id=\"mainbody\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("9032777886");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@resource-id=\"mainbody\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("Laxman@1438");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"LOGIN\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"menu outline Settings\"]")).click();
		Thread.sleep(2000);
		String data=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Lakshman guest\"]")).getText();
		System.out.println(data);
        driver.quit();
	}
	@Test
	public void Registrationmobileapplication() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Android Emulator");
		//DesiredCapabilities capabilities = new DesiredCapabilities();
        options.setCapability("platformName", "Android");
        options.setCapability("deviceName", "Android Emulator");
		options.setApp("//Users//konalakshmanarao//eclipse-workspace//Android_gustasi//src//test//java//appstore//prod-app3105.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);	
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"menu outline Settings\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Signup\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Image[@text=\"Chef managing their orders with gustasi\"]")).click();
	}
	@Test
	public void OrderOnine() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Android Emulator");
		//DesiredCapabilities capabilities = new DesiredCapabilities();
        options.setCapability("platformName", "Android");
        options.setCapability("deviceName", "Android Emulator");
		options.setApp("//Users//konalakshmanarao//eclipse-workspace//Android_gustasi//src//test//java//appstore//prod-app3105.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);	
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		//driver.findElement(By.xpath("//android.widget.EditText")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"person circle outline Account\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@resource-id=\"mainbody\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("2020202020");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@resource-id=\"mainbody\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"LOGIN\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@text=\"checkbox outline My Menu\"]/android.view.View")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.TextView[@text=\"VIEW\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=\"Add to Cart\"]")).click();
		driver.quit();
	}
}
