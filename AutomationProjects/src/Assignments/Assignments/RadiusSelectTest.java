package Assignments.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadiusSelectTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/automation-practice-form");
	    //Thread.sleep(2000);
	    //driver.navigate().refresh();
	    
	    System.out.println("The page Title "+driver.getTitle());
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)","");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    
	    WebElement rds = driver.findElement(By.id("gender-radio-1"));
	    System.out.println(rds.isSelected());
      driver.close();
  }
}
