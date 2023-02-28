package Webmath;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabCheck {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\Exclerselenium\\src\\test\\java\\Webmath\\TabCheck");
		 prop.load(ip);
	       driver.get(prop.getProperty("url"));
	      
	       driver.findElement(By.xpath(prop.getProperty("chrome.math.xpath"))).click(); 
	       Thread.sleep(1000);
	       driver.findElement(By.xpath(prop.getProperty("chrome.general.xpath"))).click();
	       driver.findElement(By.xpath(prop.getProperty("chrome.algebra.xpath"))).click();
}
}