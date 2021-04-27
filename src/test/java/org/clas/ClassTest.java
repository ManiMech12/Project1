
package org.clas;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.LibGlobal;

public class ClassTest extends LibGlobal {
	WebDriver driver;



	
		// LibGlobal li=new LibGlobal();
		// driver = new ChromeDriver();
		// driver.get("http://demo.automationtesting.in/Register.html");
		// driver.manage().window().maximize();
		// String xLoc = li.xLoc("C:\\Users\\MANI
		// SURYA\\eclipse-workspace\\FrameWork\\excel\\sheet 4.xlsx", "Sheet1", 1, 0);
		// String xLoc1 = li.xLoc("C:\\Users\\MANI
		// SURYA\\eclipse-workspace\\FrameWork\\excel\\sheet 4.xlsx", "Sheet1", 1, 1);
		// String xLoc2 = li.xLoc("C:\\Users\\MANI
		// SURYA\\eclipse-workspace\\FrameWork\\excel\\sheet 4.xlsx", "Sheet1", 1, 6);
		// WebElement txtFrstName =
		// driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		// txtFrstName.sendKeys(xLoc);
		// WebElement txtLastName =
		// driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		// txtLastName.sendKeys(xLoc1);
		// WebElement txtAddress =
		// driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		// txtAddress.sendKeys(xLoc2);
		//
		//

	

	@AfterClass
	private void afterClass() {
		// driver.quit();
	}

	@BeforeMethod
	private void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterMethod
	private void afterMethod() {
		Date date = new Date();
		System.out.println(date);

	}

	@Test
	private  void beforeClass() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANI SURYA\\eclipse-workspace\\FrameWork\\chrome\\chromedriver_win32\\chromedriver.exe");
		
LibGlobal li=new LibGlobal();driver=new ChromeDriver();driver.get("http://demo.automationtesting.in/Register.html");driver.manage().window().maximize();
	String xLoc = li.xLoc("C:\\Users\\MANI SURYA\\eclipse-workspace\\FrameWork\\excel\\sheet 4.xlsx", "Sheet1", 1, 0);
	String xLoc1 = li.xLoc("C:\\Users\\MANI SURYA\\eclipse-workspace\\FrameWork\\excel\\sheet 4.xlsx", "Sheet1", 1, 1);
	String xLoc2 = li.xLoc("C:\\Users\\MANI SURYA\\eclipse-workspace\\FrameWork\\excel\\sheet 4.xlsx", "Sheet1", 1, 6);
	WebElement txtFrstName = driver
			.findElement(By.xpath("//input[@placeholder='First Name']"));txtFrstName.sendKeys(xLoc);
	WebElement txtLastName = driver
			.findElement(By.xpath("//input[@placeholder='Last Name']"));txtLastName.sendKeys(xLoc1);
	WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));txtAddress.sendKeys(xLoc2);
	// private void test() throws InterruptedException {
	//
	//
	//
	// WebElement txtUserName = driver.findElement(By.id("email"));
	// txtUserName.sendKeys("Hello");
	//
	// WebElement txtPass = driver.findElement(By.id("pass"));
	// txtPass.sendKeys("haiiiii");
	//
	//
	// Thread.sleep(2000);
	// WebElement btnClick = driver.findElement(By.name("login"));
	// btnClick.click();
}}
