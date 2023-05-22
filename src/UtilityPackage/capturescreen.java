package UtilityPackage;

import Reusable_class.Exception;
import Reusable_class.File;
import Reusable_class.String;
import Reusable_class.TakeScreenShot;
import Reusable_class.TakeScreenshot;
import Reusable_class.WebDriver;

public class capturescreen {
	public static void CaptureScreenshot(WebDriver driver, String screenShotName) {
		
		try {
			TakeScreenshot ts=(TakeScreenShot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File file = new File("C:\\SDET Training\\ScreenShotAssignment\\ScreenShot"+screenShotName+ ".png");
			FileHandler.copy(src, file);
			System.out.println("Captured ScreenShot - By Selenium WebDriver");
		}catch(Exception  e) {
			System.out.println("something went wrong while copying file "+e.getMessage());
		}

	}

}
