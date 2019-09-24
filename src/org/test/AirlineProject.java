package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AirlineProject {
	static WebDriver driver;
	@Test(groups="homepage")
	private void testCase1() throws AWTException, InterruptedException {
		WebElement e20 = driver.findElement(By.xpath("//input[@id='airport-select-origin']"));
		e20.click();
		Robot r= new Robot();
		for (int i = 0; i <=7; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	WebElement e21 = driver.findElement(By.xpath("//input[@id='airport-select-destination']"));
	e21.click();
	for (int j = 0; j <=4; j++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.findElement(By.xpath("(//span[@class='radio__control-indicator'])[2]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
	WebElement e = driver.findElement(By.xpath("//span[text()='24']"));
	JavascriptExecutor k=(JavascriptExecutor)driver;
	k.executeScript("arguments[0].click()", e);
	WebElement e1 = driver.findElement(By.xpath("//button[@id='searchButton']"));
	k.executeScript("arguments[0].click()", e1);
	WebElement e2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	k.executeScript("arguments[0].click()", e2);
	Thread.sleep(3000);
	WebElement e3 = driver.findElement(By.xpath("//a[contains(text(),'Start reservation')]"));
	Thread.sleep(3000);
	k.executeScript("arguments[0].click()", e3);
	Thread.sleep(3000);
	WebElement e4 = driver.findElement(By.xpath("(//input[@class='textbox'])[1]"));
	k.executeScript("arguments[0].setAttribute('value','gunaanjali03@gmail.com')", e4);
	Thread.sleep(3000);
	WebElement e5 = driver.findElement(By.xpath("(//input[@class='textbox'])[2]"));//sendKeys("Guna@123");
	Thread.sleep(3000);
	k.executeScript("arguments[0].setAttribute('value','Guna@123')", e5);
	Thread.sleep(3000);
	WebElement e6 = driver.findElement(By.xpath("//a[contains(text(),'Login and continue')]"));
	Thread.sleep(3000);
	k.executeScript("arguments[0].click()", e6);
	WebElement e7 = driver.findElement(By.xpath("//select[@class='selectgender user-gender']"));
	Select s=new Select(e7);
	s.selectByVisibleText("Male");
	
	WebElement e8 = driver.findElement(By.xpath("//select[@class='selectday user-day']"));
	Select s1=new Select(e8);
	s1.selectByVisibleText("24");
	
	WebElement e9 = driver.findElement(By.xpath("//select[@class='selectmonth user-month']"));
	Select s2=new Select(e9);
	s2.selectByVisibleText("Mar");
	
	WebElement e10= driver.findElement(By.xpath("//select[@class='selectyear user-year']"));
	Select s3=new Select(e10);
	s3.selectByVisibleText("1996");
	
	driver.findElement(By.xpath("//select[@class='select user-email']")).click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("(//a[@class='button'])[2]")).click();
	Thread.sleep(3000);
	}
	@Test(groups="seat resrvation page1")
	private void testCase2() throws InterruptedException {
		WebElement g = driver.findElement(By.xpath("//button[@class='airplane__seat XST button--default']"));
		Thread.sleep(3000);
		g.click();
	}
		@Test(groups="navigate to sa page2")
		private void testcase3() throws InterruptedException {
		WebElement e22 = driver.findElement(By.xpath("//a[@onclick='return requestContinue();']"));
		Thread.sleep(3000);
		e22.click();
	}
	@Test(groups="seat resrvation page 2")
	private void testcase4() {
		driver.findElement(By.xpath("(//span[@class='airplane__item airplane__item--seat'])[14]")).click();
		driver.findElement(By.xpath("//a[@onclick='return requestContinue();']")).click();
	}
	@Test(groups="navigate to payment page")
	private void testcase5() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button']")).click();
		
	}
	@BeforeClass
	private void test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\eclipse\\jee-2019-06\\eclipse\\Gunasekaran\\TestNGProject\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.norwegian.com/us/");
	}


}
