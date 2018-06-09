package pac;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/lenovo/Desktop/page.html");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='psw']")).sendKeys("admin");
	}

}
