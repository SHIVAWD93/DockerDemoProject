package SampleGitpod.DockerDemo;
 import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerDemoCl {
	
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities dc = DesiredCapabilities.chrome();
	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
	driver.get("www.google.com");
	System.out.println(driver.getTitle());
}
}
