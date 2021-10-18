package autosuggestion;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Action figures']"));
		org.openqa.selenium.Point loc = ele.getLocation();
		double x= loc.getX();
		double y= loc.getY();
		
		//typcasting
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",ele);

	}

}

	
