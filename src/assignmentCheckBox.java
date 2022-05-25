import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
//		//----------IS check box checked----------
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		//----------IS check box unchecked----------
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		
//		//--count of checkbox---
//		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	WebElement select=	driver.findElement(By.cssSelector("div[class='mb-4'] select"));
		Select option = new Select(select);
		 option.selectByIndex(3);
		System.out.println(option.getFirstSelectedOption().getText());
		WebElement select1=	driver.findElement(By.xpath("//body/div/div/div/div/div/div[2]/div/div[4]/div/div[3]/select"));
		Select option1 = new Select(select1);
		option1.selectByIndex(4);
		System.out.println(option.getFirstSelectedOption().getText());
		WebElement select2=	driver.findElement(By.xpath("//body/div/div/div/div/div/div[2]/div/div[4]/div/div[5]/select"));
		Select option2 = new Select(select2);
		option2.selectByIndex(1);
		System.out.println(option.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector("button[class*='c-neutral-900']")).click();
		
		boolean month =driver.findElement(By.cssSelector("div[class*='ta-right']")).getText().contains("Janaury");
		while(!month)
		{
			driver.findElement(By.cssSelector("div[class*='ta-right'] svg")).click();
			break;
		}
		
	int counts=	driver.findElements(By.cssSelector(".DayPicker-Day")).size();
	for (int i=0; i<counts;i++)
	{
	String text=	driver.findElements(By.cssSelector(".DayPicker-Day")).get(i).getText();
	if(text.equalsIgnoreCase("1"))
	{
		driver.findElements(By.cssSelector(".DayPicker-Day")).get(i).click();
		break;
	}
	}
		}

}
