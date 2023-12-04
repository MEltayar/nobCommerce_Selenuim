package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.Utils;

public class TestBase {

	protected WebDriver driver;
	public String url = "https://www.nopcommerce.com/en";

	@BeforeTest //open the browser
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Utils.navigateToUrl(driver, url);
	}

	@AfterTest //close the browser
	public void closeBrowser() 
	{
		driver.quit();
	}

}
