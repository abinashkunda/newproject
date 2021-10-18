package autosuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("field-keywords"));
		ele.sendKeys("computer");
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		
		
		

	}

}
