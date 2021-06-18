package com.academymortgage.aboutus;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutUsTest {

	// Given when then
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iswar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://academymortgage.com/");
		driver.manage().window().maximize();	
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

	@Test
	public void testWhoWeAre() {
		// when
		// Who We Are Page
		WebElement aboutUsElement = driver.findElement(By.id("cm-dropdown1"));
		aboutUsElement.click();
		driver.findElement(By.linkText("Who We Are")).click();
		String ActualTitle1 = driver.getTitle();
		Assert.assertEquals(ActualTitle1, "Who We Are | Academy Mortgage Corporation");
		System.out.println("Who We Are - title matches");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	void testContactUs() {
		// Contact Us
		WebElement aboutUsElement = driver.findElement(By.id("cm-dropdown1"));
		aboutUsElement.click();
		driver.findElement(By.linkText("Contact Us")).click();
		String ActualTitle5 = driver.getTitle();
		Assert.assertEquals(ActualTitle5, "Contact Us | Academy Mortgage Corporation");
		System.out.println("Contact Us - title matches");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	void testWhereWeBegin() {
		// Where We Began
		WebElement aboutUsElement = driver.findElement(By.id("cm-dropdown1"));
		aboutUsElement.click();
		driver.findElement(By.linkText("Where We Began")).click();
		String ActualTitle4 = driver.getTitle();
		Assert.assertEquals(ActualTitle4, "Where We Began | Academy Mortgage Corporation");
		System.out.println("Where We Began - title matches");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	void testHowWeMeasure() {
		// How We Measure Success
		WebElement aboutUsElement = driver.findElement(By.id("cm-dropdown1"));
		aboutUsElement.click();
		driver.findElement(By.linkText("How We Measure Success")).click();
		String ActualTitle3 = driver.getTitle();
		Assert.assertEquals(ActualTitle3, "How We Measure Success | Academy Mortgage Corporation");
		System.out.println("How We Measure Success - title matches");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testWhoSetsUsApart() {
		// Who Sets Us Apart
		WebElement aboutUsElement = driver.findElement(By.id("cm-dropdown1"));
		aboutUsElement.click();
		driver.findElement(By.linkText("What Sets Us Apart")).click();
		String ActualTitle2 = driver.getTitle();
		Assert.assertEquals(ActualTitle2, "What Sets Us Apart | Academy Mortgage Corporation");
		System.out.println("Who Sets Us Apart - title matches");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
 
}
