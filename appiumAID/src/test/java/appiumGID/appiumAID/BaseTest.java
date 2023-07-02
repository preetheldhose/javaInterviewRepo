package appiumGID.appiumAID;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseTest {
	
	public AndroidDriver driver;
	
	@BeforeClass
	public void ConfigureAppium() throws InterruptedException, MalformedURLException {
		
		/*
		AndroidDriver Object: 
		1. Appium code is written and sent to the Appium Server - which in then talks to UIAutomator2 
		2. Which in-turn talks to the simulator or the app in the Android device via Capabilities
		*/
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("RahulEmulator");
		options.setApp("//Users//preetheldhose//eclipse-workspace//appiumAID//src//test//java//resources//APKFiles.zip");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {	
		
		driver.quit();
		
	}


}
