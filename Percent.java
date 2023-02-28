package Webmath;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Percent {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\Exclerselenium\\src\\test\\java\\Webmath\\Percent");
		 prop.load(ip);
	       driver.get(prop.getProperty("url"));
	      
	       driver.findElement(By.xpath(prop.getProperty("chrome.algebra.xpath"))).click(); 
	       Thread.sleep(1000);
	       driver.findElement(By.xpath(prop.getProperty("chrome.wpp.xpath"))).click();
	       driver.findElement(By.xpath(prop.getProperty("chrome.input1.xpath"))).
	       sendKeys(prop.getProperty("input1"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.input2.xpath"))).
	       sendKeys(prop.getProperty("input2"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.click.xpath"))).click();
	       driver.findElement(By.xpath(prop.getProperty("chrome.back.xpath"))).click();
	       driver.findElement(By.xpath(prop.getProperty("chrome.input3.xpath"))).
	       sendKeys(prop.getProperty("input3"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.input4.xpath"))).
	       sendKeys(prop.getProperty("input4"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.click.xpath"))).click();
	       driver.findElement(By.xpath(prop.getProperty("chrome.back.xpath"))).click();
	       driver.findElement(By.xpath(prop.getProperty("chrome.input5.xpath"))).
	       sendKeys(prop.getProperty("input5"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.input6.xpath"))).
	       sendKeys(prop.getProperty("input6"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.click.xpath"))).click();
	      

}
}
