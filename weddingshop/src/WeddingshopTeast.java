import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WeddingshopTeast {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenim drivers\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver driver=new ChromeDriver();
		  driver.get("https://www.weddingshop.com");
		  Thread.sleep(1000);

	        driver.manage().window().maximize();
	        //Actions action=new Actions(driver);
	        //action.moveToElement(driver.findElement(By.cssSelector("#main-dropdown-menu-1"))).build().perform();
	 
	        driver.navigate().to("https://www.weddingshop.com/category/homeware-furniture");
	        Thread.sleep(1000);
	        driver.manage().window().maximize();
	        driver.findElement(By.linkText("Candles & Diffusers")).click();
	        //List<WebElement> checkbox=driver.findElements(By.className("#product-filter-items-prices > li:nth-child(2) > label > input"));
	        //Thread.sleep(1000);
	       /* for(int i=0;i<=checkbox.size();i++)
            {
            	WebElement local_checkbox= checkbox.get(i);
            	String Value=local_checkbox.getAttribute("Type");
            	System.out.println("Values from check box list are======>>>>>"+Value);
            	
                       }*/
            
	        WebElement chk = driver.findElement(By.xpath("//*[@id=\"product-filter-items-prices\"]/li[2]/label"));
	        //System.out.print(chk.isDisplayed());
	        chk.click();

	}

}
