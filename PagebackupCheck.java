package Webmath;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagebackupCheck {
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	Properties prop = new Properties();
	FileInputStream ip= new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\Exclerselenium\\src\\test\\java\\Webmath\\tabscheck");
	 prop.load(ip);
       driver.get(prop.getProperty("url"));
       driver.findElement(By.xpath(prop.getProperty("chrome.mathtab.xpath"))).click();
       driver.navigate().back();
       
       
      
}
}
