import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		//-------------- Add to cart test case-----------------
		
				String[] veggies= {"Cauliflower", "Cucumber", "Beetroot","Brocolli"}; 
				driver.get("https://rahulshettyacademy.com/seleniumPractise/");
				 addItems(driver,veggies);
				/* driver.findElement(By.cssSelector("img[alt='Cart']")).click();
				 driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
				 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 WebDriverWait w= new WebDriverWait(driver, 5);
				 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
				 
				 driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
				 driver.findElement(By.cssSelector("button.promoBtn")).click();
				 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
				System.out.println (driver.findElement(By.cssSelector("span.promoInfo")).getText());
				*/
				
//				driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
//				driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
//				WebDriverWait w= new WebDriverWait(driver, 5);
//				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));
//			System.out.println(driver.findElement(By.cssSelector("div#results")).getText());
			
			
		}
			public static void addItems(WebDriver driver,  String[] veggies) {
				int j=0;
			List<WebElement> products =driver.findElements(By.xpath("//h4[@class='product-name']"));
			
			for (int i=0; i<products.size();i++) {
			String[] veggiesList = products.get(i).getText().split("-");
			String formated= veggiesList[0].trim();
			List itemsList= Arrays.asList(veggies);
			
			if(itemsList.contains(formated)) {
				driver.findElements(By.xpath("//div[@class='product-action'] //button")).get(i).click();
				j++;
				if (j==veggies.length) {
					break;
				}
			}
				
			}	
			}
		
	}


