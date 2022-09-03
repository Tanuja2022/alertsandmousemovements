package uk.axone.seleniumadvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaDriverService;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;

/**
 * @author Karthik.Gandhinathan
 */
public class CrossBrowserTesting {

    WebDriver driver;
    //  String browserType;
    //String appUrl;

    @Parameters({"applications", "browser"})
    @Test
    public void testBrowsers(String appUrl, String browserType)  {

        String path = System.getProperty("user.dir") + "/src/test/resources/input_config.properties";

        //to create an empty property list
        // Properties prop = new Properties();
//
//        try {
//            //connection to a physical file. i.e.input_config.properties
//            FileInputStream fis = new FileInputStream(path);
//            //loaded the properties
//            prop.load(fis);
//            browserType = prop.getProperty("aBrowser");
//            appUrl = prop.getProperty("aUrl");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        if (browserType.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\software\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\software\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("opera")) {
            System.setProperty("webdriver.opera.driver", "C:\\Program Files\\software\\Drivers\\operadriver_win64\\operadriver.exe");
            driver = new OperaDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Program Files\\software\\Drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.get(appUrl);
        System.out.println(driver.getTitle());
        driver.quit();


    }

}