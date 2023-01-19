package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./javasel/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("sagar");
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.className("form-check-label")).click();
		driver.findElement(By.id("log-in")).click();
	//	 1 homepage should be displayed
		
		//get title 
		String My_Title=driver.getTitle();
	    String Expected_Title="Demo App";
		Assert.assertEquals(My_Title, Expected_Title);
		System.out.println("test completed");
		Thread.sleep(3000);
		
// 2 password must be present error message
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.id("username")).sendKeys("sagar");
		driver.findElement(By.id("log-in")).click();
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText();
		System.out.println("error : "+text);
	     String Expected_text="Password must be present";
	     Assert.assertEquals(text, Expected_text);
	     System.out.println("test completed");
		
	     // 3 Username must be present Error message 
	     driver.navigate().refresh();
	     driver.findElement(By.id("password")).sendKeys("abc");
			driver.findElement(By.id("log-in")).click();
			Thread.sleep(4000);
			String text1 = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText();
			System.out.println("error : "+text1);
		     String Expected_text1="Username must be present";
		     Assert.assertEquals(text1, Expected_text1);
		     System.out.println("test completed");
	     
		     // 4 Both Username and Password must be present Error message
		     driver.navigate().refresh();
				driver.findElement(By.id("log-in")).click();
				Thread.sleep(4000);
				String text2 = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText();
				System.out.println("error : "+text1);
			     String Expected_text2="Both Username and Password must be present";
			     Assert.assertEquals(text2, Expected_text2);
			     System.out.println("test completed");
			     Thread.sleep(3000);
			     driver.close();
		     
	}

}
