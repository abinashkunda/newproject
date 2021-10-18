package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test30 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		if(ele.isEnabled()) {
			ele.click();
			System.out.println("pass:element is enabled");
		}
		else
		{
			System.out.println("fail:element is not enabled");
		}
		Thread.sleep(5000);
		driver.close();
		
			
		}

	}


