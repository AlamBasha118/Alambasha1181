package ScreenShotAssignment12;

import org.testng.annotations.Test;



public class screenshotassignment {
	@Test
	public void Assignment() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SDET Training\\ScreenShotAssignment\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='MenuItem-module--icon--2h29D']")).click();
		driver.findElement(By.id("username")).sendKeys("alambashakoutal@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Alambasha1618");
		driver.findElement(By.xpath("//*[@name='action']")).click();
		
		
		driver.findElement(By.id("data-cs-mask-rewards//1234")).click();
		
		
	}
	@AfterMethod
	public void capturescreen(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			ReusableMethod.CaptureScreenshot(driver, result.getName());
		}
		driver.quit();
	}

}
