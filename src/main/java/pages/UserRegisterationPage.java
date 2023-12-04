package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegisterationPage extends PageBase{

	//Constructor
	public UserRegisterationPage(WebDriver driver) {
		super(driver);
		
	}

	//Locate all register window fields
	By firstName = By.id("FirstName");
	By lastName = By.id("LastName");
	By Email =By.id("Email");
	By confirmEmail = By.id("ConfirmEmail");
	By UserName = By.id("Username");
	By Password = By.id("Password");
	By confirmPassword =By.id("ConfirmPassword");
	By Company = By.id("Details_CompanyIndustryId");
	By registerButton = By.id("register-button");
	//Locate the message displayed on the registered page to assert it
	public By registerSucessfullyText = By.className("page-title");

	//Method to fill the register fields then click the register button
	public void userRegister(String First_Name,String Last_Name,String email,String Confirm_Email,
			String User_Name,String password,String Confirm_Password) 
	{
		Utils.setText(driver, firstName, First_Name);
		Utils.setText(driver, lastName,Last_Name);
		Utils.setText(driver, Email, email);
		Utils.setText(driver, confirmEmail, Confirm_Email);
		Utils.setText(driver, UserName, User_Name);
		Utils.setText(driver, Password, password);
		Utils.setText(driver, confirmPassword, Confirm_Password);
		Utils.selectFromDropDown(driver, Company, "I am student");
		Utils.clickButton(driver, registerButton);
	}
}

