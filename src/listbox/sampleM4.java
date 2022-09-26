package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sampleM4 {
	 public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver","E:\\seleium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
	 driver.get("file:///E:/webpage%20html/MultipleDropdown.html"); //double click on html program --address present top field 
	 
WebElement	s=driver.findElement(By.xpath("//select[@id='1245']"));
	Select j=new Select(s);
    j.selectByIndex(0);
    j.selectByIndex(1);
    j.selectByIndex(2);
    j.selectByIndex(3);
    j.deselectByIndex(1);
    j.selectByIndex(3);
	 }
}