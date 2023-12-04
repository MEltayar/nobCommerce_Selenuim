package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	MyAccountPage myAccount;
	String oldPassword= "123789";
	String newPassword= "11223344";
	//declaring a web element to use it in assertion
	WebElement passwordChangedSuccessfullyMessage;
	
	@Test
	public void changePassword()
	{
		homePage = new HomePage(driver);
		homePage.moveToProfileIcon();
		homePage.openLoginPage();
		loginPage=new LoginPage(driver);
		loginPage.userLogin("eltayar07", "112233");
		homePage.moveToProfileIcon();
		homePage.openMyAccountPage();
		myAccount= new MyAccountPage(driver);
		//Invoke the change password method
		myAccount.changePassword(oldPassword, newPassword);
		//Converting the By to web element to make assertion
		passwordChangedSuccessfullyMessage=driver.findElement(myAccount.passwordChangedSuccessfullyMessage);
		//Assertion
		Assert.assertTrue(passwordChangedSuccessfullyMessage.isDisplayed());
}
}
