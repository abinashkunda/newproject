package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test36 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.xpath("//div[@class='components_button_label'][1]")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("firstName")).sendKeys("abinash");
		driver.findElement(By.xpath("//div[@class='closeButton hideButton_panelContainer']")).click();
		 Alert b = driver.switchTo().alert();
		    System.out.println(b.getText());
		    
		    b.accept();
		

	}

}
