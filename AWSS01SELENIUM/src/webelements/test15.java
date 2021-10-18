package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement ele = driver.findElement(By.name("searchVal"));
		if(ele.isDisplayed())
		{
			ele.sendKeys("phone");
			System.out.println("pass:element is sdisplayed");
		}
		else
		{
			System.out.println("fail:element is not displayed");
			}
		Thread.sleep(5000);
		driver.close();
	}
}


