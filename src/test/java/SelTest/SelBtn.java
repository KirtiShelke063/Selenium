package SelTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SelBtn {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.navigate().to("https://demoqa.com/upload-download");
		 
		 // Explicit wait 
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    

	      
	   WebElement button=wait.until(
			   ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='downloadButton']")));
			   
			button.click();
	        System.out.println("Download button clicked successfully.");

	       // driver.quit();
	    
	}

}
