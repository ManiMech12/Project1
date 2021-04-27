package org.clas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	WebDriver driver;

	@BeforeClass
	private void tco() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANI SURYA\\eclipse-workspace\\FrameWork\\chrome\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}

	@Parameters({ "Firstname", "Lastname", "Address", "Email", "Phone" })
	@Test
	private void tc1(String Firstname, String Lastname, String Address, String Email, String Phone) {

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lastname);
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@type ='tel']")).sendKeys(Phone);
		driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]")).click();
		driver.findElement(By.id("checkbox1")).click();
	}

	@Test
	private void tc2() {
		
		driver.findElement(By.xpath("//div//li[@class='ng-scope']//a[text()='Bulgarian']")).click();
		
//		List<WebElement> findElements = driver.findElements(By.xpath(
//				"//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']//following::div//ul//li"));
//		String attribute = findElements.get(0).getAttribute("value");
//		if (findElements.equals(s)) {
//
//		}
//		System.out.println(attribute);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", lang);
//
//		Select select = new Select(lang);
//
//		List<WebElement> options = select.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			WebElement webElement = options.get(i);
//			String text = webElement.getText();
//		}
//
//		select.selectByVisibleText(lang);
//		WebElement skillsDropDown = driver.findElement(By.xpath("(//select[@type='text'] )[1]"));
//		Select select1 = new Select(skillsDropDown);
//		select1.selectByVisibleText(s);

//		driver.findElement(By.xpath("//div//div[@id='msdd']"));
//		List<WebElement> dropdownoptions = driver.findElements(By.xpath("//div//li[@class='ng-scope']"));
//		int size = dropdownoptions.size();
//		for (int i = 0; i < size; i++) {
//			dropdownoptions.get(i).click();
//
//		}
	}

}
