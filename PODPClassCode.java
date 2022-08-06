package HomeWorkAssignments;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class PODPClassCode extends LoadableComponent<PODPClassCode>
{
	@FindBy (id = "txtUsername")
	private WebElement UserName;
	
	@FindBy (id = "txtPassword")
	private WebElement Password;
	
	@FindBy (id = "btnLogin")
	private WebElement ClickLogin;
	
	private WebDriver driver;
	
	private String loginPageTitle = "OrangeHRM";
	
public 	PODPClassCode()
{
	System.setProperty("webdriver.chrome.driver","C:\\eclipse\\webdrivertraining\\test\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	PageFactory.initElements(driver, this);
	get();
}
	
public void Login(String user,String pass)
{   
	UserName.clear();
	UserName.sendKeys(user);	
	Password.clear();
	Password.sendKeys(pass);
	
	ClickLogin.click();
}


public  String printuser (String user)
{
	System.out.println(user);	
	return user;
}


public  String printpass (String pass)
{
	System.out.println(pass);	
	return pass;
}

@Override
protected void isLoaded() throws Error {
	// TODO Auto-generated method stub
	
	assertEquals(driver.getTitle(),loginPageTitle,"Page is not Loaded.");
	
}

@Override
protected void load() {
	// TODO Auto-generated method stub
	driver.get("https://opensource-demo.orangehrmlive.com/");
}


}
