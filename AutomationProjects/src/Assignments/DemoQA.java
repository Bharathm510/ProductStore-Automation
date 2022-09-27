package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Documents\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/automation-practice-form");
    //Thread.sleep(2000);
    //driver.navigate().refresh();
    
    System.out.println("The page Title "+driver.getTitle());
    WebElement fName = driver.findElement(By.id("firstName"));
    if(fName.isDisplayed())
    {
    	System.out.println("The fName is present");
    }
    else 
    {
    	System.out.println("The fName is Not Present");
    }
    fName.sendKeys("Bharath");
    driver.findElement(By.id("lastName")).sendKeys("Raj");
    driver.findElement(By.id("userEmail")).sendKeys("bharath@gmail.com");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,300)","");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//label[text()='Male']")).click();
    
    WebElement rds = driver.findElement(By.id("gender-radio-1"));
    System.out.println(rds.isSelected());
    WebElement uNum = driver.findElement(By.id("userNumber"));
    if(uNum.isEnabled())
    {
    	uNum.sendKeys("9876543210");
    }else {
    	uNum.clear();
    	System.out.println("Mobile number is now cleared please fill again");
    }
   // WebElement cldr = driver.findElement(By.id("dateOfBirthInput"));
    //cldr.click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--027\"]")).click();
    Thread.sleep(2000);
    driver.close();
    
	}
}
