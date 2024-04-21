package week3.homeassign;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AjioHome {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		//WebDriverWait wait= (new WebDriverWait(driver, 5));
		//wait.until(ExpectedConditions . elementToBeClickable (By.xpath("//input[@id='Men']")));
        WebElement we = driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
        we.click();
		
		Thread.sleep(2000);
	    WebElement we1 = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
	    we1.click();
	    
	    Thread.sleep(2000);
	    String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
	    System.out.println(text);
	    
	    List<WebElement> brandlist = driver.findElements(By.xpath("//div[@class='brand']"));
	    int size = brandlist.size();
	    System.out.println("Total number of brands :" +size);
	    
	    List<String> list1 = new ArrayList<String>();
	    for(int i=0; i<brandlist.size(); i++)
	    {
	    	
	    	list1.add(brandlist.get(i).getText());
	    }

	    Collections.sort(list1);
	    for (int i = 0; i < list1.size(); i++) {
	    	System.out.println(list1.get(i));
	    	
	    }
	    
		driver.close();

	}

}
