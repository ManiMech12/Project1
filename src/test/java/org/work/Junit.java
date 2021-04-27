package org.work;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {

	static WebDriver driver;

	@BeforeClass

	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANI SURYA\\eclipse-workspace\\FrameWork\\chrome\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);

	}

	@Test
	public void test() throws InterruptedException {

		String title = driver.getTitle();
		boolean b = title.contains("log in");
		Assert.assertTrue("verify title", b);

		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Hello");
		String name = txtUserName.getAttribute("value");
		Assert.assertEquals("verify username", "Hello", name);

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("haiiiii");
		String name1 = txtPass.getAttribute("value");
		Assert.assertEquals("verify Password", "haiiiii", name1);

		Thread.sleep(2000);
		WebElement btnClick = driver.findElement(By.id("login"));
		btnClick.click();
	}
}