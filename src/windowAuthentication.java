import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAuthentication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
	//----------------WebAuthentication---------------------	
//		driver.get("https://admin:admin@the-internet.herokuapp.com/");
//		System.out.println(driver.getTitle());
//		driver.findElement(By.linkText("Basic Auth")).click();
//	System.out.println(	driver.findElement(By.cssSelector("div[class='example'] p")).getText());
		
		
		//---------------AutoIt upload file---------------------
		driver.get("https://online2pdf.com/text-to-pdf#");
		driver.findElement(By.cssSelector("..browse_button")).click();
//		Runtime.getRuntime().exec("C:\\Users\\Admin\\Documents\\Selenium\\AutoitScript.exe");
		
		
	}

}
