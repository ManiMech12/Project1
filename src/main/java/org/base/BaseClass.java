package org.base;

import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseClass {
    
	WebDriver driver;

public void getDriver() {
	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
  public void launchUrl(String data ) {
     driver.get(data);

}
  public void enterText(WebElement element, String data) {
	  element.sendKeys(data);
	

}
  public void btnClick(WebElement element) {
   element.click();

}
  public void moveToElement(WebElement element) {
   Actions ac = new Actions(driver);
   ac.moveToElement(element).perform();

}
  
 public void enterTextByJs(String data,WebElement element) {
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("arguments[0], setAttribute('value','" + data + "')",element);
}
 public void getText(WebElement element, String data) {
	element.getText();
	
}

public void getAttri(WebElement element, String data) {
	element.getAttribute(data);

}

public void dragAndDrop(WebElement element,WebElement element2) {
    Actions ac = new Actions(driver);
    ac.dragAndDrop(element, element2).perform();
}

 public void rightclck(WebElement element) {
   Actions ac = new Actions(driver);
   ac.contextClick(element).perform();
}

 
public void doubleclck(WebElement element) {
	Actions ac = new Actions(driver);
    ac.doubleClick(element);
}
public void scanner(WebElement element) {
   Scanner sc = new Scanner((Readable) element);
   
}





	}



