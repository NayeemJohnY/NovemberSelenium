/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

import com.Practise.Selenium.Utility.BrowserSelection;
import com.crm.qa.util.ExcelAPI;

public class ParametersData {

	public static void main(String[] args) throws Exception {
		ExcelAPI excelapi= new ExcelAPI("F:\\Workspace_Selenium\\NovemberSelenium\\FacebookReg.xlsx");
		
		if(!excelapi.isSheetExist("HomePage"))
			excelapi.addSheet("HomePage");
		System.out.println(excelapi.isSheetExist("HomePage"));
		 WebDriver driver;
		 driver=BrowserSelection.SelectBrowser("chrome");
			driver.get("https://www.facebook.com/");
			excelapi.addColumn("RegisterData", "Status");
		 for (int i=2; i<=excelapi.getRowCount("RegisterData"); i++)
		 {
			
				System.out.println("**************");
			 String firstname=excelapi.getCellData("RegisterData", "firstname", i);
				System.out.println(firstname);
				String surname=excelapi.getCellData("RegisterData", "surname", i);
				System.out.println(surname);
				String email=excelapi.getCellData("RegisterData", "email", i);
				System.out.println(email);
				String password=excelapi.getCellData("RegisterData", "password", i);
				System.out.println(password);
				String gender=excelapi.getCellData("RegisterData", "gender", i);
				System.out.println(gender);
				String dob=excelapi.getCellData("RegisterData", "dob", i);
				System.out.println(dob);
				driver.findElement(By.name("firstname")).clear();
				driver.findElement(By.name("firstname")).sendKeys(firstname);
				driver.findElement(By.name("lastname")).clear();
				driver.findElement(By.name("lastname")).sendKeys(surname);
				driver.findElement(new ByAll(By.name("reg_email__"),By.id("u_0_s"))).clear();
				driver.findElement(new ByAll(By.name("reg_email__"),By.id("u_0_s"))).sendKeys(email);
				driver.findElement(By.xpath("//*[@type='password'][@id!='pass']")).clear();
				driver.findElement(By.xpath("//*[@type='password'][@id!='pass']")).sendKeys(password);
				driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
				excelapi.setCellData("RegisterData", "Status", i, "Pass");
		 }
	}
}
*/