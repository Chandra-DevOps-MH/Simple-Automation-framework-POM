package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameTextBox = By.id("username");
	private By passwordTextBox = By.id("password");
	private By loginBtn = By.id("submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername(String Enterusername)
	{
		driver.findElement(usernameTextBox).sendKeys(Enterusername);
	}
	public void enterPassword(String Enterpassword)
	{
		driver.findElement(passwordTextBox).sendKeys(Enterpassword);
	}
    public void Loginbtn()
    {
    	driver.findElement(loginBtn).click();
    }

		

}
