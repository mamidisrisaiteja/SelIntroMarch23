package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		
		try {
		prop=new Properties();
		FileInputStream fip=new FileInputStream("C:\\Users\\AN574BV\\eclipse-workspace\\TejaJasmiSeleniumIntro1\\src\\main\\java\\config\\config.properties");
		prop.load(fip);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\AN574BV\\OneDrive - EY\\Desktop\\Sai Teja\\Personal\\SW\\Selenium\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/saitejamamidi/Oracle Content - Accounts/Oracle Content/Sai Teja/Automation/Selenium Practice/SW/geckodriver-v0.24.0-win64/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}
	

}
