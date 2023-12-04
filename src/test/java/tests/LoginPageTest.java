package tests;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import reader.ReadDataFromJson;


public class LoginPageTest extends TestBase {
	//Taking object from HomePage
	HomePage homePage;
	//Taking object from UserRegisterationPage
	LoginPage loginPage;
	//Create webelement
	WebElement logOutBtn;
	String url = "https://www.nopcommerce.com/en";
	ReadDataFromJson readDataFromJson;
	
	@DataProvider
	public Object[][] getLoginData() throws FileNotFoundException
	{
		readDataFromJson = new ReadDataFromJson();
		return readDataFromJson.readData().Login;
		
	}
	
	@Test (dataProvider = "getLoginData")
	public void Login(String username, String password)
	{
		//initialize object from homePage to access it
		homePage=new HomePage(driver);
		//invoke the moveToProfileIcon method
		homePage.moveToProfileIcon();
		//invoke the openLoginPage method
		homePage.openLoginPage();
		//initialize object from LoginPage to access it
		loginPage=new LoginPage(driver);
		//Invoke the LoginWithCorrectEmailAndPassword giving it the email and password
		loginPage.userLogin(username, password);
		//invoke the moveToProfileIcon method again to assert the logOut button
		homePage.moveToProfileIcon();
		//Convert the logOutButton to web element to manage doing assertion on it
		logOutBtn = driver.findElement(loginPage.logOutButton);
		//Assert the logOut button
		Assert.assertTrue(logOutBtn.isDisplayed());
	}
}
