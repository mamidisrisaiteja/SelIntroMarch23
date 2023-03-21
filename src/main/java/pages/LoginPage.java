package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//*[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='pass']")
	WebElement password;
	
	
	@FindBy(xpath="//*[@id='send2']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
   public String validateLoginPageTitle() {
	   
	   System.out.println("I am in login page title ver");
	   
	   System.out.println(driver);
		
		return driver.getTitle();
		
	}
	public HomePage login(String un,String pwd) throws Exception {
		
		new LoginPage();
		
		System.out.println(un);
		System.out.println(pwd);
//		Thread.sleep(8000);
		driver.findElement(By.id("email")).sendKeys("mamidisrisaiteja@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Srisai@90");
		driver.findElement(By.id("send2")).click();
//		username.sendKeys("mamidisrisaiteja@gmail.com");		
//		password.sendKeys("Srisai@90");	
//		loginBtn.click();		
		return new HomePage();
	}
	
}
