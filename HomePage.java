package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./javasel/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("sagar");
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.className("form-check-label")).click();
		driver.findElement(By.id("log-in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("amount")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
