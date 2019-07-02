package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobject {
	WebDriver driver;
	public pageobject(){ 
		PageFactory.initElements(driver, this.driver);
		
	}

	@FindBy(name="userName") public static WebElement un;
	@FindBy(name="password") public static WebElement psd;
	@FindBy(xpath="//input[name='login']") public static WebElement ok;
	/*public void login()
	{
		un.sendKeys("mercury");
		psd.sendKeys("mercury");
		ok.click();
	}*/
}
