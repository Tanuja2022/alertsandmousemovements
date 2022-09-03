package uk.axone.industrystandards;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestHUDBrowsers {
    @Test
    public void testHeadlessBrowser() throws InterruptedException {

        WebDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX);

        driver.get("https://www.amazon.co.uk/");
        System.out.println("Title is --" + driver.getTitle());
        System.out.println("Url is ---" + driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.quit();
    }


}
