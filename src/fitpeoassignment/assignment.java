package fitpeoassignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment {
	public static void main(String[] args) throws Exception

	{	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KALYANI\\Desktop\\Current\\JARS\\chromedriver127.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://www.fitpeo.com/");
	driver.manage().window().maximize();


	//Thread.sleep(30000);
	driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[6]/a/div")).click();

	//Thread.sleep(5000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,400)", " ");

	Thread.sleep(30000);
	//WebElement slider1=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]"));
	//WebElement slider2=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input"));

	//Actions act=new Actions(driver);

	//act.dragAndDrop(slider1, slider2);
	//act.clickAndHold(slider1).moveToElement(slider2).release().build().perform();
	
	WebElement slider=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]"));
	js.executeScript("arguments[0].scrollIntoView();",slider);
	
	
	WebElement slidertext=driver.findElement(By.xpath("//input[@type='number']"));
	slidertext.clear();
	slidertext.sendKeys("560");
	
	Thread.sleep(30000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
	Thread.sleep(30000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
	Thread.sleep(30000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
	Thread.sleep(30000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input")).click();
 
}
}
