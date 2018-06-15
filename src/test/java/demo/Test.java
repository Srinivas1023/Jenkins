package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    @org.testng.annotations.Test
	public void main() {
      System.setProperty("webdriver.gecko.driver","F://geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
	}

}
