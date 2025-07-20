package Tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin()
	{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername("student");
		loginpage.enterPassword("Password123");
		loginpage.Loginbtn();
		
		System.out.println("Title of the page is" +driver.getTitle());
	}

}
