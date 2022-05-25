import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class takeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("E:\\SS.png"));
		
		//handling broken links
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement linkDriver= driver.findElement(By.id("gf-BIG"));
		SoftAssert a=new SoftAssert();
		List<WebElement> links= linkDriver.findElements(By.cssSelector("li.gf-li a"));
		for (WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection conn	=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			Integer respCode= conn.getResponseCode();
			a.assertTrue(respCode<400, "The link which i broken is "+link.getText()+" with the response code of "+respCode);
		}
	
		a.assertAll();
	}

}
