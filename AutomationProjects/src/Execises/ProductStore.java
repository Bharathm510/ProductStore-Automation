package Execises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




public class ProductStore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(5000);
		System.out.println("The page Url is " + driver.getCurrentUrl());
		System.out.println("The Page Title is " + driver.getTitle());
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(5000);
		//System.out.println("The Page Title is " + driver.getPageSource());
		driver.findElement(By.xpath("//input[@id=\"sign-username\"]")).sendKeys("bharathrajm5@gmail.com");
		System.out.println(" Username is Filled");
		driver.findElement(By.xpath("//input[@id=\"sign-password\"]")).sendKeys("bharathraj@123");
		System.out.println(" Password is Filled");
		driver.findElement(By.xpath("//button[@onclick=\"register()\"]")).click();
		System.out.println("Sign up is completed");
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
