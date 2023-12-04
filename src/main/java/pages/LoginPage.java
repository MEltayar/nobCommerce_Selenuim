package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
	HomePage homePage;
	Utils utils;

	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	//Locate the user name text box
	By userName = By.id("Username");
	//Locate the ID text box
	By ID = By.id("Password");
	//Locate the login button
	By loginButton = By.xpath("//input[@value='Log in']");
	//Locate the logOut button > Public because we use it on the LoginPageTest 
	public By logOutButton = By.className("ico-logout");

	//Method to login with email and password then click the login button
	public void userLogin(String User_Name, String id) {

		Utils.setText(driver, userName, User_Name);
		Utils.setText(driver, ID, id);
		Utils.clickButton(driver, loginButton);
		
	}
	
}
