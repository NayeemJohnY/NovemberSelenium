import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Practise.Selenium.Utility.BrowserSelection;

public class Selindigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");
		
		driver.get("https://www.goindigo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='roundTrip']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Departure Date']")).click();
		
		//datepicker
		Select sel = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		sel.selectByVisibleText("2019");
		
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		sel1.selectByVisibleText("Apr");
		
		List<WebElement> cal = driver.findElements(By.xpath("//div[contains(@class,'first')]//table[@class='ui-datepicker-calendar']//td"));
		int count = cal.size();
		System.out.println(count);
		for(WebElement ele:cal)
		{
			if(ele.getText().equals("6"))
			{
				ele.click();
				break;
			
			}
			
		}
		
				  List<WebElement> cal2 = driver.findElements(By.xpath("//div[contains(@class,'last')]//table[@class='ui-datepicker-calendar']//td"));
					int count1 = cal2.size();
					System.out.println(count1);
					for(WebElement ele:cal2)
					{
						if(ele.getText().equals("8"))
						{
							ele.click();
							break;
						
						}
						
					}
			   
	
		
		driver.findElement(By.xpath("//*[contains(@class,'passenger')]/button[text()='Done']")).click();
		/*$x("//*[contains(@class,'passenger')]/button[text()='Done']") --TO SLECT DONE TAG
		 * $x("//div[contains(@class,'first')]//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[5]")-TO SELECT PARTICLUAR COULM
		 *$x("//div[contains(@class,'first')]//table[@class='ui-datepicker-calendar']//td")-TO GET ALL COLUMNS OF CALENDER 
		*/
		
	}

}
