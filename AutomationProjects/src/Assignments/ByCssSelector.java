package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ByCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://www.amazon.in/");
	    
	    driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("samsung");
	    
	    driver.findElement(By.cssSelector("span>input[id=\"nav-search-submit-button\"]")).click();
	   
	    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	    
	    //JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    //js1.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(5000);
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-csa-c-content-id=\\\"nav_cs_books\\\"]")));
	    
	    driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_books\"]")).click();
	    System.out.println("The page title is" +driver.getTitle());
	    driver.close();
	   // driver.findElement(By.cssSelector("label[text()='Today's Deals']")).click();
	    //System.out.println("The page title is "+driver.getTitle());
	    
	    
	    
	    
	   
	    
	    
	  	}

}
