package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abinashkunda24@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("abhimanyu@123");	
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        
   String title=driver.getTitle();
   System.out.println(title);
   
   String url=driver.getCurrentUrl();
   System.out.println(url);
   if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		   {
	   System.out.println("pass homepage is displayed");
		   }
   else
   {
	   System.out.println("fail homepage is not displayed");
		   }
   
   driver.close();
   
	}

}
