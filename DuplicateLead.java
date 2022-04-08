package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		//Identify the Username field and enter the username
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 
		 //Identify the password and enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //Click on Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Click on crm/sfa
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 	 
		 //create lead
		 driver.findElement(By.linkText("Leads")).click();		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FSS");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murali");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Swetha");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("development");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("C++ developer");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muraliswetha93@gmail.com");
		 
		 WebElement dd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dropdown = new Select(dd);
		 dropdown.selectByVisibleText("New York");
		 
		 driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 driver.findElement(By.name("submitButton")).click();
		
		 //Get the title of the application
		 String title = driver.getTitle();
		 System.out.println(title);

	}

}
