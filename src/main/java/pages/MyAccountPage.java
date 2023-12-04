package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	HomePage homepage;
	
	//Locate all change password fields
	By changePasswordLink = By.linkText("Change password");
	By oldPassword = By.id("OldPassword");
	By newPassword = By.id("NewPassword");
	By confirmNewPassword = By.id("ConfirmNewPassword");
	By changePasswordButton = By.xpath("//input[@value='Change password']");
	//public because it will be called in assertion
	public By passwordChangedSuccessfullyMessage = By.xpath("//div[@class='result']");
	
	//Method to change the password, it takes the old and new passwords then click the button
	public void changePassword(String oldPass, String newPass)
	{
		Utils.clickButton(driver, changePasswordLink);
		Utils.setText(driver, oldPassword, oldPass);
		Utils.setText(driver, newPassword, newPass);
		Utils.setText(driver, confirmNewPassword, newPass);
		Utils.clickButton(driver, changePasswordButton);
	}

}
