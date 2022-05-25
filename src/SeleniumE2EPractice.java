import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumE2EPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
/*		
//Static Dropdown automation		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement staticDropdown=	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown =new Select (staticDropdown);
		dropdown.selectByValue("AED");
		dropdown.selectByVisibleText("USD");
	System.out.println(	dropdown.getFirstSelectedOption().getText());
//===================================================================================================================================
	
//Passenger Increasing Dropdown
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	
	for( int i=1;i<4;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
//====================================================================================================================================
	
//Dynamic Departure dropdown cities
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.cssSelector("a[value='PNQ']")).click();
	WebDriverWait w= new WebDriverWait(driver,5);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  a[value='MAA']")));
	driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  a[value='MAA']")).click();
	//====================================================================================================================================
	
	//Current date selector
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
//==================================================================================================================================
	
	//Auto suggestive dropdown
	
	driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	Thread.sleep(2000L);
	List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	
	for(WebElement option:options) {
	if(	option.getText().equalsIgnoreCase("India")) {
		option.click();
		break;
	}
		
	}
//==================================================================================================================================
	
	//Ajax mouse movement 

//thre is a class called Actions.
	
	Actions a = new Actions(driver);
	
	a.moveToElement(driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"))).click().build().perform();
	
	*/
//==================================================================================================================================
/*	
//Window Handle concept.
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	
	//using ajax moouse movement to click on the link.
	Actions a= new Actions(driver);
	a.moveToElement(driver.findElement(By.cssSelector("a.blinkingText"))).click().build().perform();
	//give the knowledge to the driver to move to child page
	
	Set<String> handles=driver.getWindowHandles();
	Iterator<String> it= handles.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
//System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());

	
	String finalText=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split("with")[0];
	System.out.println(finalText);
	
	driver.switchTo().window(parentId);
	driver.findElement(By.id("username")).sendKeys(finalText);
	*/
//================================================================================================================================
	
//Frames concept
		driver.get("https://jqueryui.com/droppable/");
//Switching frames
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Thread.sleep(2000L);
		Actions a =new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
//=============================================================================================================================
		// get the no of counts of object using by its tag name
		// for the entire page
		
	System.out.println(	driver.findElements(By.tagName("a")).size());
	WebElement footerDriver= driver.findElement(By.cssSelector("footer.clearfix.simple"));
System.out.println(	footerDriver.findElements(By.tagName("a")).size());

WebElement columnDriver=  footerDriver.findElement(By.cssSelector("div div:nth-child(2) ul"));
	System.out.println(columnDriver.findElements(By.tagName("a")).size());
	
	
	}
		}

