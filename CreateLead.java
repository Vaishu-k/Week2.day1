package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaishnavi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/13/95");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select t1=new Select(source);
		t1.selectByIndex(2);
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indus=new Select(industry);
		indus.selectByValue("IND_SOFTWARE");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own=new Select(ownership);
		own.selectByVisibleText("Public Corporation");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Manual Tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("11889");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("114");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automate");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Created Information");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("24");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Family");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vaishukrishnan95@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("httpsTestLeaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("gururajan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("guru");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("MIG:95 ");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("mm Nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chengalpattu");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select d5=new Select(state);
		d5.selectByIndex(1);
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603001");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select d6=new Select(country);
		d6.selectByValue("IND");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("11");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		 

	}

}
