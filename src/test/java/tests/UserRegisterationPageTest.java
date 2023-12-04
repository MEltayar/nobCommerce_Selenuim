package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegisterationPage;

public class UserRegisterationPageTest extends TestBase {
	//Taking object from HomePage
	HomePage homePage;
	//Taking object from UserRegisterationPage
	UserRegisterationPage userReg;
	//Create webelement
	WebElement regSuccessfully;
	
	@Test
	public void userCanRegisterSuccessfully() 
	{
		//initialize object from homePage to access it
		homePage= new HomePage(driver);
		//invoke the moveToProfileIcon method
		homePage.moveToProfileIcon();
		//invoke the openRegisterPage method
		homePage.openRegisterPage();
		//initialize object from UserRegisterationPage to access it
		userReg = new UserRegisterationPage(driver);
		//Invoke the userRegister method giving it all the required fields
		userReg.userRegister("Mostafa", "Eltayar", "Mostafaeltayar0007@gmail.com",
				"Most afaeltayar000777@gmail.com", "MostafaEltayarrr", "123456", "123456");
		//Convert the registerSucessfullyText to web element to manage doing assertion on it
		regSuccessfully = driver.findElement(userReg.registerSucessfullyText);
		//Assert the Register text
		Assert.assertTrue(regSuccessfully.getText().contains("Register"));
	
	}
	

}
