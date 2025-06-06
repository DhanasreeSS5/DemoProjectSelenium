package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	public WebDriver driver;

	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and text()='More info ']")WebElement adminusers;
	@FindBy(xpath="//a[@href='javascript:void(0)' and @onclick='click_button(1)']")WebElement newuseradd;
	@FindBy(xpath="//input[@id='username']")WebElement newusersusername;
	@FindBy(xpath="//input[@id='password']")WebElement newuserspassword;
	@FindBy(xpath="//select[@id='user_type']")WebElement selectuser;
	@FindBy(xpath="//button[@type='submit' and @name='Create']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alertalreadyexist;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successfulalert;

public void adminUsers()
{
	adminusers.click();
}
public void newUserAdminUser()
{
	newuseradd.click();
}
public void adminUsersInfoUname(String username)
{
	newusersusername.sendKeys(username);
}
public void adminUsersInfoPwd(String password)
{
	newuserspassword.sendKeys(password);
}
public void adminUsersTypeSelect(String dropdown)
{
//	Select select=new Select(selectuser);
//	select.selectByIndex(2);
	Select select=new Select(selectuser);
	select.selectByVisibleText(dropdown);
	
}
public void saveAdminUsersInfo()
{
	savebutton.click();
}
public boolean userAlreadyExistAlertdisplayed()
{
	return alertalreadyexist.isDisplayed();
	
}
public boolean successfullAlertdisplayed()
{
	return successfulalert.isDisplayed();
	
}
}
