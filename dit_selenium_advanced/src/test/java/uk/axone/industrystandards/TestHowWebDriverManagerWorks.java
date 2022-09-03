package uk.axone.industrystandards;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class TestHowWebDriverManagerWorks {

    @Test
    public void testWDMBinaries() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX);


        driver.get("https://www.bbc.co.uk/news");
        System.out.println("Title is --" + driver.getTitle());
        System.out.println("Url is ---" + driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.quit();
    }
}
