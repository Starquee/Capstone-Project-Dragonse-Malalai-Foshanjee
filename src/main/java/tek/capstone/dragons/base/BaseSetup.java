package tek.capstone.dragons.base;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import tek.capstone.dragons.config.Browser;
import tek.capstone.dragons.config.ChromeBrowser;
import tek.capstone.dragons.config.ChromeHeadless;
import tek.capstone.dragons.config.EdgeBrowser;
import tek.capstone.dragons.config.FireFoxBrowser;
import tek.capstone.dragons.utilities.ReadYamlFiles;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseSetup {
	private static WebDriver webDriver;
	private final ReadYamlFiles enviromentVariables;
	public static Logger logger;

	public BaseSetup() {
		// we nedd to get the path to env_Config file and log4j files and store them as
		// String

		String filePath = System.getProperty("user.dir")+"/src/main/resources/env_config.yml";
		String log4jPath = System.getProperty("user.dir")+"/src//main/resources/log4j.properties";
        try {
        	enviromentVariables = ReadYamlFiles.getInstance(filePath);
		} catch (Exception e) {
			System.out.println("failed to load env-config property. Check your filePath");
			throw new RuntimeException("failed to load  env-config file: " + e.getMessage());
		}
		logger = logger.getLogger("logger_file");
		PropertyConfigurator.configure(log4jPath);
	}

	public WebDriver getDriver() {
		return webDriver;
	}

	public void setupBrowser() {
		HashMap uiProperty = enviromentVariables.getYamlProperty("ui");
		String url = uiProperty.get("url").toString().toLowerCase();
		Browser browser;

		switch (uiProperty.get("browser").toString().toLowerCase()) {

		case "chrome":
			if ((boolean) uiProperty.get("headless")) {
				browser = new ChromeHeadless();
			} else {
				browser = new ChromeBrowser();
			}
            webDriver = browser.openBrowser(url);
            break;

		case "firefox":
			browser = new FireFoxBrowser();
			webDriver = browser.openBrowser(url);
			break;
			
		case "edge":
			browser = new EdgeBrowser();
			webDriver = browser.openBrowser(url);
			break;
		default:
			throw new RuntimeException("Browser name in config does not match any of the cases");

		}
	}

	public void quiteBrowser() {
		if (webDriver != null)
			webDriver.quit();
	}

}


