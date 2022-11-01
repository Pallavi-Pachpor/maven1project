package switching;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiveElement {
 static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		driver = s1.setUp("chrome","https://demo.actitime.com/login.do");
   WebElement element = driver.switchTo().activeElement();
   String str = element.getAttribute("placeholder");
   if (str.equals("Username")){
	   System.out.println("Mouse pointer is in username field");
		element.sendKeys("admin",Keys.TAB);
	}
	driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
}	   
   
	}


