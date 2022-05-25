import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autoit {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
String downloadPath= System.getProperty("user.dir");
HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

chromePrefs.put("profile.default_content_settings.popups", 0);

chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://online2pdf.com/text-to-pdf#");
		driver.findElement(By.cssSelector("button[class='browse_button']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Documents\\Selenium\\Selenium notes\\AutoitScript.exe");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class='convert_button']")).click();
		Thread.sleep(5000);
		File f = new File(downloadPath+"/Info.pdf");
		if (f.exists())
		{
			System.out.println("File Found");
		}
	}

}
