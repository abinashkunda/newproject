package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class parallel {
	public WebDriver driver;
	@Parameters({"browser Name"})
	@Test
	public void demo(String browser) {
		if(browser=="chrome");{
			driver=new ChromeDriver();
		}
		else
			{
				driver-=new FirefoxDriver();
			}
		}
}

