package Execises;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class=\"primaryBtn font24 latoBold widgetSearchBtn \"]")).click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"flight_list_item_2_RKEY:8ec30bcc-7191-4293-8d8c-82d6577d0b20:190_0\"]/div[1]/div[3]/span")).click();
	}

}
