package autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("cars"));
		Select s= new Select(ele);
		s.selectByIndex(2);
		s.selectByValue("399");
		
		Thread.sleep(3000);
		
		s.deselectByIndex(2);
		s.deselectByValue("399");
		
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		for(WebElement b:opt) {
			System.out.println(b.getText());
		}
		driver.close();
	}

}
