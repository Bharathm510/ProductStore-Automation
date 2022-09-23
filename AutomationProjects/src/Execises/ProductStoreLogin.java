package Execises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductStoreLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(5000);
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("bharathrajm5@gmail.com");
		driver.findElement(By.id("loginpassword")).sendKeys("bharathraj@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]")).click();
		System.out.println("Successfully Log in");
		Thread.sleep(10000);
		driver.close();

	}

}
