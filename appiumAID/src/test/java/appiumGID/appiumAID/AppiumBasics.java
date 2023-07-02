package appiumGID.appiumAID;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumBasics extends BaseTest{

	@Test
	public void appiumTest() throws MalformedURLException, InterruptedException {
		//ConfigureAppium();
		Thread.sleep(8000);
		
		/*
		 * Use AccessibilityId, xpath, classname & androidUIAutomator to access the path of the components within the app.
		 * 
		 */
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		Thread.sleep(8000);
		//tearDown();

	}

}
