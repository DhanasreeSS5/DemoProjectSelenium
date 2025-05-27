package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base {
	//@Test(groups= {"regression"})//it only run cprrect
	@Test
	public void loginTest() throws IOException
	{
		//String username="admin";
		//String password="admin";
		String username=ExcelUtility.getStringData(1, 0,"loginpage");
		String password=ExcelUtility.getStringData(1, 1,"loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSigninButton();
		boolean ishomepageavailable=loginpage.isDashboardDisplayed();
		Assert.assertTrue(ishomepageavailable);//true
	}

}
