package appiumGID.appiumAID;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {
	
	@Test
	public void appiumTest() throws MalformedURLException, InterruptedException{
		
		//start the server which is at this path = // /usr/local/lib/node_modules/appium/build/lib/main.js
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		
		
		//AndroidDriver Object:
		//Appium code is written and sent to the Appium Server - which in then talks to UIAutomator2,
		//which in-turn talks to the simulator or the app in the Android device.
		//Capabilities = 
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("RahulEmulator");
		options.setApp("//Users//preetheldhose//eclipse-workspace//appiumAID//src//test//java//resouces//APKFiles.zip");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(25000);
		driver.quit();
		
		Thread.sleep(25000);
		//stop the server
		service.stop();
	}

}
