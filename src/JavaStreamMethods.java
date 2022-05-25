import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
//Maximize the screen
		driver.manage().window().maximize();
//launch website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//click on the veglist to sort it
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
//get all the elements present in the column first		
	List<WebElement> veggies=	driver.findElements(By.xpath("//tr/td[1]"));
//now get the text present in the first column 
List<String> texts=	veggies.stream().map(s->s.getText()).collect(Collectors.toList());
//Sort the text now from the first column
  List<String>sortedTexts= texts.stream().sorted().collect(Collectors.toList());
//using the assertion compare the first clicked list and the manually sorted list
  Assert.assertTrue(texts.equals(sortedTexts));
  
  List<String> Price;
  //2nd requirment is to fetch the price of the Beans from the 2nd column ie: price column
  do {
	  List<WebElement> veggiesNew=	driver.findElements(By.xpath("//tr/td[1]"));
   Price= veggiesNew.stream().filter(s->s.getTagName().contains("Rice")).map(s->getBeansPrice(s)).collect(Collectors.toList());
  Price.forEach(a->System.out.println(a));
  if(Price.size()<1) {
	  driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
  }
  }while(Price.size()<1);
  
  //-----------------------------------------------------------------
  
  //Filter the input form and get all the fetched are equal to send keys.
  
  
  
	}

	private static String getBeansPrice(WebElement s) {
		// TODO Auto-generated method stub
		String actualprice= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return actualprice;
	}
	}
