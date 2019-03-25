package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class one {

	static WebDriver driver;
	static String url;
@BeforeClass
public void qt() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/examsys/login.thtml";
}
@Test //µÇÂ¼
public void a() throws InterruptedException{
	driver.get(url);
	driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td/input")).sendKeys("hujianming");
	driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");
	WebElement s=driver.findElement(By.name("usertype"));
	Select s1=new Select(s);
	s1.selectByIndex(2);
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();;
	}
	}
