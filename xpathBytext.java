package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBytext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Appliances']")).click();
		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Travel']")).click();
		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);

		driver.quit();
	}
}