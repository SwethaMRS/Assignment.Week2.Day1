package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	// Launches new browser for every execution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Setup the driver 
		WebDriverManager.chromedriver().setup();  // static
		
		// Launch the browser
		 ChromeDriver driver=new ChromeDriver();
		 
		 // Load the url
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 // Maximize the browser
		 driver.manage().window().maximize();
		 
		 //Identify the Username field and enter the username
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 
		 //Identify the password and enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //Click on Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Click on crm/sfa
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Get the title of the application
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 
		
	}

}
