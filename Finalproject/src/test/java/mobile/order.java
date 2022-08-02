package mobile;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class order {
	
	@Test()
    public void Order() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sharath.r\\\\Downloads\\\\chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net");
        driver.manage().window().maximize();
        //AllMobiles
        driver.findElement(By.xpath("//a[@href='mobile.html']")).click();
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//tbody[@id='myTable']/tr[2]/td[5]/a")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        @SuppressWarnings("unused")
		String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.xpath("//input[@id='inputFirstName']")).sendKeys("sharath");
        driver.findElement(By.xpath("//body/div[@class='container']/div[1]/div[2]/form[1]/div[1]/div[2]/input")).sendKeys("r");
        Thread.sleep(2000);
        driver.findElement(By.id("inputEmail")).sendKeys("sharathru98@gmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("sharath@123");
        Thread.sleep(2000);
        driver.findElement(By.id("flexRadioDefault1")).click();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7975537705");
        Thread.sleep(2000);
        driver.findElement(By.id(" address1")).sendKeys("chennanayakanapalya");
        Thread.sleep(2000);
        driver.findElement(By.id("address2")).sendKeys("nagasandra post");
        Thread.sleep(2000);
        driver.findElement(By.id("inputCity")).sendKeys("banglore");
        Thread.sleep(2000);
        WebElement State=driver.findElement(By.id("inputState"));
        Thread.sleep(2000);
        Select S=new Select(State);
        S.selectByIndex(2);
        driver.findElement(By.id("inputZip")).sendKeys("560073");
        driver.findElement(By.xpath("//input[@rel='apple']")).click();
        driver.findElement(By.xpath("//input[@rel='samsung']")).click();
        driver.findElement(By.xpath("//div[@class='apple']//option[2]")).click();
        driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("1");
        WebElement Count = driver.findElement(By.id("bought"));
        Select s3= new Select( Count );
        s3.selectByIndex(1);
        Thread.sleep(2000);
        List<WebElement> a=driver.findElements(By.id("gridCheck1"));
        a.get(0).click();
        a.get(1).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
        driver.quit();

    }

}


