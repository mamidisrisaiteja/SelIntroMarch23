package com.orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AN574BV\\OneDrive - EY\\Desktop\\Sai Teja\\Personal\\SW\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
driver.findElement(By.id("email")).sendKeys("mamidisrisaiteja@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Srisai@90");
driver.findElement(By.id("send2")).click();
	}

}
