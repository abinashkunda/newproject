package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.close();

	}

}
