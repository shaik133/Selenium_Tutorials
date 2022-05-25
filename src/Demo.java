import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//invoke .exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
		
		//invoke webdriver object
		
		WebDriver driver=new ChromeDriver();
		
		//getting the google url by using driver method
//		driver.get("https://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("csshaikjafarsadiq@gmailcom");
//		driver.findElement(By.name("pass")).sendKeys("memyself");
//		//driver.findElement(By.linkText("ಪಾಸ್‌ವರ್ಡ್ ಮರೆತಿರುವಿರಾ?")).click();
//		driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
//			driver.get("https://login.salesforce.com/");
//			driver.findElement(By.xpath("//*[@id='username']")).sendKeys("login");
//			driver.findElement(By.cssSelector("#password")).sendKeys("pass");
//			driver.findElement(By.xpath("//*[@id='Login']")).click();
//			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
//		------------using regural expression on xpath and css-------------
//		driver.get("https://login.salesforce.com/");
//		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("username");
//		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("password");
//		driver.findElement(By.cssSelector("#Login")).click();
		
		
		//---Xpath Parent Child traverse relationship -------
//		driver.get("https://www.google.com/search?q=ultimatix&oq=&aqs=chrome.0.69i59i450l3.1552064975j0j7&sourceid=chrome&ie=UTF-8");
//		//driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("pictures");
//		driver.findElement(By.xpath("//div[@class='tF2Cxc']/div/a/h3")).click();
//		driver.findElement(By.cssSelector("input[id='form1']")).sendKeys("1351215");
//		driver.findElement(By.xpath("//button[contains(@id,'proceed')]")).click();
//		driver.findElement(By.xpath("//div[@class='forget-link']/a")).click();
		
		
		//---------Static drop down methods----------
		
		/*WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//select is class and we are creating object "dropdown" for that class-
		Select dropdown=new Select(staticDropdown);
		//calling website
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//calling object "dropdown"  call all the methods present in Select class 
		dropdown.selectByIndex(3);
		//by using value
		dropdown.selectByValue("AED");
		//by using visible text
		dropdown.selectByVisibleText("USD");
		//make sure selected options are correct by prompting them in console
		System.out.println(dropdown.getFirstSelectedOption().getText());*/
		
		//----------------------------------------------------------------------------------
		
		//----drop down where slect tag is not availabe and also if u want to increase any vales in dropdown
		
		
//		//calling website
//			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//				driver.findElement(By.id("divpaxinfo")).click();
//				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//				/*for (int i=1;i<5;i++) {
//					driver.findElement(By.id("hrefIncAdt")).click();
//				}*/
//				
//				int i=1;
//				while (i<5) {
//					driver.findElement(By.id("hrefIncAdt")).click();
//					i++;
//				}
//				
//				for (int x=0;x<3;x++) {
//					driver.findElement(By.id("hrefIncChd")).click();
//				}
//				for (int y=0;y<2;y++) {
//					driver.findElement(By.id("hrefIncInf")).click();
//				}
//				
//				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//				driver.findElement(By.id("btnclosepaxoption")).click(); 
				
//--------------------------------------------------------------------------------------
				//------------------Dynamic drop down---------------------------
		
		
/*      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='IXG']")).click();
//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		//----have to mention index number if dynamic drop down has more than one same value - one way
//		driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();
	//----another way is parent child relationship.---This is prefered( select parent xpath and with one space give child xpath 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GAU']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='STV']")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	*/
//-----another eg:------------
/*      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXL']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		*/
		//----------------------------------------------------------------------------------------------
		
	//------AutoSuggestive Drop down--------------------
		
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("autosuggest")).sendKeys("Aus");
//		Thread.sleep(2000);
//		//get the options by css selector
//	List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//		
//	for(WebElement option:options) {
//		if (option.getText().equalsIgnoreCase("Austria")) {
//			option.click();
//			break;
//		}
//	}
//		
		//----Another eg--------------
/*		driver.findElement(By.id("autosuggest")).sendKeys("Ja");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option:options) {
			if (option.getText().equalsIgnoreCase("Jamaica")) {
				option.click();
				break;
			}
		}
		
		*/
		//----------------------------------------------------------------------------------
			
		// ------------------check box selecting--------------
		
/*		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());// to print in console is check box is checked or not
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());// to print in console is check box is checked or not
		
		//-----------To get the number of checkbaoxes present---------
//--- You have to find a common selector from all the checkbox eg: type, name or id etc using that u can get the counts
		// you have to select find elements here
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		*/
		
	//----------------------------------------Practice code-----------------
		
/*		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//     Auto suggestive dropdown--
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options) {
			if (option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			}
					
		}
		
//    Static dropdown
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		dropdown.selectByValue("AED");
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

// Dynamic drop down--------
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for (int i=1; i<4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		for (int h=0; h<3; h++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		int n=0;
		while(n<4){
			driver.findElement(By.id("hrefIncInf")).click();
			n++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
// dynamic multiple window dopdown.-------
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='SAG']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='VTZ']) [2]")).click();
		
// check box-------
		
			driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
			
			System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
			
			*/
		
		//System.out.println(driver.getTitle()); //validates the page title is correct
		
		//System.out.println(driver.getCurrentUrl()); //to get the current url which is invoking is correct or not
		
		//System.out.println(driver.getPageSource()); //To get the page source
	
		//driver.get("http://yahoo.com");
		//driver.navigate().back(); //to navigate back once it hits the requested url
		//driver.close(); //to close the current chrome browser once the test case is passed
		//driver.quit(); //to close all the browser opened by the selenium
		
	//-----------E2E testing-----
/*		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//------Auto suggestive drop down---------
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
	List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for (WebElement option:options) {
		if(option.getText().equalsIgnoreCase("India")) {
			option.click();
			break;
		}	
	}
	
//------Select drop down----------
	WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select (staticdropdown);
	dropdown.selectByIndex(2);
	dropdown.selectByValue("INR");
	dropdown.selectByVisibleText("USD");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
//---------Passengers dropdown--------------
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	
	int i=1;
	while(i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
	for (int h=0; h<3; h++) {
		driver.findElement(By.id("hrefIncChd")).click();
	}

//-----------Dynamic dropdown-----------------
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOP']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='TRV']")).click();
	
//-------- Date Calender-----------
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	
// ---- checkbox-----------
	
	driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
//-----------radio buttns-----------
	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//	driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style");
//	if (driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("0.5")) {
//		System.out.println("Is disabled");
//		Assert.assertTrue(true);
//	}
//	else {
//		Assert.assertFalse(true);
//	}
	*/

//-------------- Add to cart test case-----------------
		
/*		String[] veggies= {"Cauliflower", "Cucumber", "Beetroot","Brocolli"}; 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		 addItems(driver,veggies);
		 driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		 driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebDriverWait w= new WebDriverWait(driver, 5);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		 
		 driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.cssSelector("button.promoBtn")).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println (driver.findElement(By.cssSelector("span.promoInfo")).getText());
		*/
		
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		WebDriverWait w= new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));
	System.out.println(driver.findElement(By.cssSelector("div#results")).getText());
	
	
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
