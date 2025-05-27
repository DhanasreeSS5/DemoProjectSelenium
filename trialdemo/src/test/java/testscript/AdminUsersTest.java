package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;
import pages.AdminUsersPage;

public class AdminUsersTest extends Base{
	@Test
	public void adminUsersTest()
	{
		String username="AnnMary";
		String password="admin";
		String dropdown="Partner";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	AdminUsersPage adminusespage=new AdminUsersPage(driver);
	adminusespage.adminUsers();
	adminusespage.newUserAdminUser();
	adminusespage.adminUsersInfoUname(username);
	adminusespage.adminUsersInfoPwd(password);
	//adminusespage.adminUsersInfoPwd(password);
	//adminusespage.adminUsersTypeSelect();
	adminusespage.adminUsersTypeSelect(dropdown);
	adminusespage.saveAdminUsersInfo();
	boolean wrongalertvar=adminusespage.userAlreadyExistAlertdisplayed();
	Assert.assertTrue(wrongalertvar);
    boolean successalertvar=adminusespage.successfullAlertdisplayed();
    Assert.assertTrue(successalertvar);
	
	}

}
