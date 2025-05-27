package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;
import pages.ManageNewspage;

public class ManageNewsTest extends Base{
	@Test
	public void manageNewsTest()
	{

		String username="admin";
		String password="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickTheSignInButton();
		
//		boolean ishomepageavailable=loginpage.isDashboardDisplayed();
//		Assert.assertTrue(ishomepageavailable);
		ManageNewspage managenewspage=new ManageNewspage(driver);
		String newsenter="SALES MELA";
		boolean managenewsdispvariable=managenewspage.isManageNewsDisplayed();
		//Assert.assertTrue(managenewsdispvariable);
		managenewspage.moreInfolink();
		managenewspage.newsLink();
		
		managenewspage.newstext(newsenter);
		//obj1.newstext("Rain In Kerala");
		managenewspage.savebutton();
		boolean ismanagenewsdispvar=managenewspage.isAlertMsgDisplayed();
		Assert.assertTrue(ismanagenewsdispvar);
		
	}

}
