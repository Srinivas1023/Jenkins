package demo;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {
    @org.testng.annotations.Test
	public void main() {
      System.setProperty("webdriver.gecko.driver","F://geckodriver.exe");
      DesiredCapabilities capabilities = DesiredCapabilities.firefox();
      capabilities.setCapability("marionette", true);
      capabilities.setBrowserName("firefox");
      capabilities.setPlatform(Platform.WINDOWS);
      WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
	}

}
