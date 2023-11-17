package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	ExtentReports extent;
	@Test
	public void UC1() {
		extent.createTest("Initial Demo");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).click();
		driver.findElement(By.id("APjFqb")).clear();
		driver.findElement(By.id("APjFqb")).sendKeys("Hello");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		driver.close();
		extent.flush();
	}
	
	@BeforeTest
	public void ExtentReport() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("DS Automation Reports");
        reporter.config().setDocumentTitle("Extent Report Title");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Akshay H");
	}

}
