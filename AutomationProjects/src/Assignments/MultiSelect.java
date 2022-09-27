package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/select-menu");
	    //Thread.sleep(2000);
	    //driver.navigate().refresh();
	    
	    System.out.println("The page Title "+driver.getTitle());
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)","");
	    
	    Thread.sleep(5000);
	    //Select select = new Select(driver.findElement(By.id("cars")));
	    //List<WebElement> ele = select.getOptions();
	    //for(WebElement ddvalue:ele) {
	    	//System.out.println(ddvalue.getText());
	    	Select select1 = new Select(driver.findElement(By.id("cars")));
	    	select1.selectByVisibleText("Volvo");
	    	Thread.sleep(2000);
	    	select1.selectByVisibleText("Audi");
	    	Thread.sleep(5000);
	    	driver.close();
	    //}
	}

}
