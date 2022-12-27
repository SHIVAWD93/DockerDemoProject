package DockerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLogin {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","./chromedriver");
		
		
		ChromeOptions co =new ChromeOptions();
		co.setHeadless(false);
		
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		// URL of the login website that is tested
		driver.get("https://auth.geeksforgeeks.org/");
		// Maximize window size of browser
		driver.manage().window().maximize();
		// Enter your login email id
		driver.findElement(By.id("luser")).sendKeys("xyz@gmail.com");
		// Enter your login password
		driver.findElement(By.id("password")).sendKeys("xyz12345");
		
		driver.findElement(By.className("signin-button")).click();
	}
}
