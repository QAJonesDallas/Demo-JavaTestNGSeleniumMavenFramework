package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FairwayMortgageFirefoxTest {

	public static WebDriver driver;

	@BeforeClass
	public void StartFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\EXTRACTED\\geckodriver.exe");
		driver = new FirefoxDriver();
		// new ChromeOptions();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void HomeAboutUsDDM() {
		try {
			driver.get("https://www.fairwayindependentmc.com/");
			System.out.println("Test AboutUs Tab on Dock...");
			// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@class='dropdown-toggle nav-link'][contains(text(),'About Us')]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void HomeLocationsDDM() {
		try {
			System.out.println("Test Locations Tab on Dock...");
			driver.findElement(By.xpath(" //a[@class='nav-link'][contains(text(),'LOCATIONS')]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void HomeLoanOptionsDDM() {
		try {
			System.out.println("Test Loan Options Tab on Dock...");
			driver.findElement(By.xpath(" //a[@class='dropdown-toggle nav-link'][contains(text(),'Loan Options')]"))
					.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void PaymentInformationDDM() {
		try {
			System.out.println("Test Payment Information on Dock...");
			driver.findElement(By.xpath("//a[@class='nav-link'][contains(text(),'PAYMENT INFORMATION')]")).click();
			// Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void ResourcesDDM() {
		try {
			System.out.println("Test the Resources Tab on Dock...");
			driver.findElement(By.linkText("RESOURCES")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void CareersDDM() {
		try {
			System.out.println("Test the Carrerrs Tab on Dock...");
			driver.findElement(By.linkText("CAREERS")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void ContactUsDock() {
		try {
			System.out.println("Test the Carrerrs Tab on Dock...");
			driver.findElement(By.linkText("CONTACT US")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void SearchDock() {
		try {
			System.out.println(
					"Test the Search/Hour glass Tab on Dock enter LOANS in text field THEN click HourGlass to Search for Loans...");
			driver.findElement(By.id("search-icon")).click();
			// Thread.sleep(1000);
			driver.findElement(By.id("txt-desktop-search")).click();
			driver.findElement(By.id("txt-desktop-search")).sendKeys("LOANS");
			driver.findElement(By.id("txt-desktop-search")).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void CloseFirefoxBrowser() {
		try {

			Thread.sleep(2000);
			driver.close();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
