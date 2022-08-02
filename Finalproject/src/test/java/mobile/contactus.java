package mobile;



import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class contactus {
	
	  @Test()
      public void contact() throws InterruptedException
      {
         System.setProperty("webdriver.chrome.driver","C:\\Users\\sharath.r\\Downloads\\chromedriver_win32//chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://mobileworld.azurewebsites.net");
         driver.findElement(By.xpath("(//a[@id='navbarDropdown'])")).click();
         driver.findElement(By.linkText("Contact Us")).click();
         Set<String> windows = driver.getWindowHandles();
         Iterator<String> it = windows.iterator();
         @SuppressWarnings("unused")
		String parentId = it.next();
         String childId = it.next();
         driver.switchTo().window(childId);
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sharath.r");
         driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("sharathru98@gmail.com");
         driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("7975537705");
         driver.findElement(By.name("message")).sendKeys("Hello");
         driver.findElement(By.xpath("//input[@type='submit']")).click();
         driver.quit();

      }
  }

