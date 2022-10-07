package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ByXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		System.out.println("The page Title is" +driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(10000);
		WebElement cl =driver.findElement(By.xpath("//img[@alt=\"Sponsored Ad - Samsung Galaxy M32 Prime Edition (Light Blue, 6GB RAM, 128GB)\"]"));
		Thread.sleep(5000);
		cl.click();
		Thread.sleep(5000);
		System.out.println("The Product Name is " + driver.getTitle());
		Thread.sleep(5000);
		//JavascriptExecutor js=  (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,300)","");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"submit.buy-now-announce\"]")).click();
		//Thread.sleep(5000);
		driver.close();

	}

}
