package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\seleium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
     Thread.sleep(3000);
	WebElement	month = driver.findElement(By.xpath("//select[@id='month']"));
	
    Select s = new Select(month); 
	
    s.selectByVisibleText("Feb");	
     
     System.out.println("**");
     
   WebElement Day = driver.findElement(By.xpath("//select[@Id='day']"));
   Select f=new Select(Day);
   f.selectByVisibleText("12");
  
WebElement  u = driver.findElement(By.xpath("//select[@id='year']"));
   
   Select h=new Select(u);
	h.selectByIndex(2);
}}
