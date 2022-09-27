package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/automation-practice-form");
	    
	    
	    System.out.println("The page Title "+driver.getTitle());
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)","");
	    
	    //Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[text()='Sports']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[text()='Reading']")).click();
	    driver.findElement(By.xpath("//label[text()='Music']")).click();
	    Thread.sleep(5000);
	    driver.close();

	}

}
