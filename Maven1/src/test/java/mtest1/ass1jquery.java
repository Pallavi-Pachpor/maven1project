package mtest1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class ass1jquery {
   static WebDriver driver;
	public static void main(String[] args)throws Throwable {
	 SeleniumUtility util= new SeleniumUtility();
 driver = util.setUp("chrome","https://jqueryui.com/");
 driver.findElement(By.xpath("//a[text()='Sortable']")).click();
 WebElement fr = driver.findElement(By.cssSelector(".demo-frame"));
 driver.switchTo().frame(0);
Actions act = new Actions(driver);
List<WebElement> list= driver.findElements(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
//WebElement target = driver.findElement(By.xpath("//li[text()='Item 7' and@class='ui-state-default ui-sortable-handle']"));
System.out.println("size of list:"+list.size());

for(int i=0;i<list.size()-1;) {
		 act.dragAndDrop(list.get(6),list.get(i)).build().perform();
		 i=i+1;
		act.dragAndDrop(list.get(i),list.get(6)).build().perform();
		 }
			 
		 }
	
}