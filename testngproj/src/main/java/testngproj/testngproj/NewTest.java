package testngproj.testngproj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() throws InterruptedException {

	  System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\SEP7\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	 
	        // Maximize the browser
	        driver.manage().window().maximize();
	 
	        // Launch Website
	        driver.get(" https://www.saucedemo.com/");
	        
	        // Maximize window size of browser 
	        driver.manage().window().maximize(); 
	        
	        String ActualTitle = "Swag Labs";
	        WebElement ExpectedTitle = driver.findElement(By.xpath("//div[@class='login_logo']"));
	        Assert.assertEquals(ExpectedTitle.getText(), ActualTitle);
	  
	        // Enter your login email id 
	        driver.findElement(By.id("user-name")) 
	            .sendKeys("standard_user"); 
	  
	        // Enter your login password 
	        driver.findElement(By.id("password")) 
	            .sendKeys("secret_sauce"); 
	        Thread.sleep(2000);
	  
	        driver.findElement(By.id("login-button")) 
	            .click(); 
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("(//div[@class='inventory_list']//div[2]//div[2]//button)[1]")).click();
	    
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("(//div[@class='inventory_list']//div[2]//div[2]//button)[2]")).click();
	        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	        driver.findElement(By.id("checkout")).click() ;
	        driver.findElement(By.id("first-name")) 
	        .sendKeys("Jyothsna"); 
	        driver.findElement(By.id("last-name")) 
	        .sendKeys("Reddy");
	        driver.findElement(By.id("first-name")) 
	        .sendKeys("Jyothsna"); 
	        driver.findElement(By.id("postal-code")) 
	        .sendKeys("1686");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("finish")).click();
	        WebElement ele= driver.findElement(By.xpath("//h2[@class='complete-header']"));
	        Assert.assertEquals("Thank you for your order!", ele.getText());
  }
}
