package pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSugestTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//pass data in to Auto-suggest Edit-Box
		driver.findElement(By.id("lst-ib")).sendKeys("cognizant careers");
		//pass "Enter" Key Operation using Actions class
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		
		//Identify the Element , where u need to perform RIGHClcik Operation
		WebElement wb = driver.findElement(By.linkText("Working Here"));
		act.contextClick(wb).perform();
		//Pass ShortCut Character Key "T" to Open NEW-TAB
		act.sendKeys("T").perform();
	}

}
