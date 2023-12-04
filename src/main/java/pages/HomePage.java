package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageBase {
	Actions actions;

	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//find the profile icon located on the home page
	By profileIcon = (By.className("user-actions-ico"));

	//find the login button that appears when hover over the profile icon
	By loginButton = (By.xpath("//a[@href='/en/login?returnUrl=%2Fen']"));

	//find the register button that appears when hover over the profile icon
	By registerButton = (By.xpath("//a [@href='/en/register?returnUrl=%2Fen']"));
	
	By myAccountButton = By.cssSelector("body.loaded._desktop:nth-child(2) div.master-wrapper-page:nth-child(7) header.header:nth-child(1) nav.navigation ul.navigation-top-menu.navigation-top-menu-user-actions li.navigation-top-menu-item:nth-child(4) ul.navigation-top-menu-sublist li.navigation-top-menu-item.account-link:nth-child(1) a.ico-account > span.navigation-top-menu-label");
			
	//Method to hover over the profile icon
	public void moveToProfileIcon()
	{
		actions = new Actions(driver);
		actions.moveToElement(driver.findElement(profileIcon)).perform();
	}

	//Method to open the register page
	public void openRegisterPage()
	{
		Utils.clickButton(driver,registerButton);
	}
	//Method to open the login page
	public void openLoginPage()
	{
		Utils.clickButton(driver,loginButton);
	}
	//Method to open My Account page
	public void openMyAccountPage()
	{
		Utils.clickButton(driver,myAccountButton);
	}



}
