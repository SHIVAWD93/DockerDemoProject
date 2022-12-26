package DockerPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWIthDocker {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		driver.get("https://hub.docker.com/");
		System.out.println(driver.getTitle());
	}
}
